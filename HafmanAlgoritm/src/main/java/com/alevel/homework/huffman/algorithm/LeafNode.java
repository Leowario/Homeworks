package com.alevel.homework.huffman.algorithm;

/**
 * @author Vitalii Usatyi
 */
class LeafNode extends Node {
    char symbol;

    @Override
    void buildCode(String code) {
        super.buildCode(code);
    }

    LeafNode(char symbol, int count) {
        super(count);
        this.symbol = symbol;
    }
}
