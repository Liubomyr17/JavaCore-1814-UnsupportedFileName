package com.company;

/*
1814 UnsupportedFileName

Change the TxtInputStream class so that it only works with txt files (* .txt).
For example, first.txt or name.1.part3.txt.
If a non-txt file is passed, for example, file.txt.exe, then the constructor should throw an UnsupportedFileNameException.
Consider what else needs to be done in the event of an exception being thrown.

Requirements:
1. The TxtInputStream class must inherit from the FileInputStream class.
2. If a txt file is passed to the constructor, TxtInputStream should behave like a regular FileInputStream.
3. If a non-txt file is passed to the constructor, an UnsupportedFileNameException should be thrown.
4. In the case of an thrown exception, super.close () should also be called.

 */

import java.io.*;
import java.nio.channels.FileChannel;



public class Solution extends FileInputStream {
    FileInputStream component;

    public Solution(String name) throws FileNotFoundException {
        super(name);
    }

    public Solution(File file) throws FileNotFoundException {
        super(file);
    }

    public Solution(FileDescriptor fdObj) {
        super(fdObj);
    }

    @Override
    public int read() throws IOException {
        return this.component.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return this.component.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return this.component.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return this.component.skip(n);
    }

    @Override
    public int available() throws IOException {
        return this.component.available();
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.component.close();
    }

    @Override
    public FileChannel getChannel() {
        return this.component.getChannel();
    }

    public static void main(String[] args) {

    }
    public class UnsupportedFileNameException extends Exception {

    }
}

