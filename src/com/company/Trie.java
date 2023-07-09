package com.company;

import java.util.Scanner;
class Node {
    Node[] children = new Node[26];
    boolean eow;
    Node() {
        this.eow = false;
        for(int i=0;i < 26; i++)
            children[i] = null;
    }
}
public class Trie {
    static Node root;
    public Trie() {
        root = new Node();
    }
    public boolean search(String patternWord) {
        int index;
        int length = patternWord.length();
        Node temp = root;
        for(int level=0; level < length; level++) {
            index = patternWord.charAt(level) - 'a';
            if(temp.children[index] == null) return false;
            temp = temp.children[index];
        }
        return temp.eow;
    }
    public void insert(String word) {
        Node temp = root;
        for(int i=0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(temp.children[index] == null)
                temp.children[index] = new Node();
            temp = temp.children[index];
        }
        temp.eow = true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trie trie = new Trie();
        // n is the total no of words in set S
        int n = sc.nextInt();
        String[] S = new String[n];
        for(int i=0; i < n; i++)
            S[i] = sc.next();
        for(int i=0; i < n; i++)
            trie.insert(S[i]);
        for(int i=0; i < n; i++)
            System.out.println( trie.search(S[i]) );
        System.out.println(trie.search("dog"));
    }
}
