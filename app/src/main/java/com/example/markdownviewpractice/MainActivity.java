package com.example.markdownviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.tiagohm.markdownview.MarkdownView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarkdownView mdv = findViewById(R.id.markdown_view);
        mdv.loadMarkdown("**1 What is javascript?**\n\n"+
                "- javascript is an object-oriented programming language" +
                " commonly used to create interactive effects in the web browser.\n"+
                "- It allows you to build into other static HTML pages\n---\n"+
                "**2 What is the difference between Java and javascript**\n\n"+
                "1. Java is a complete programming language whereas javascript" +
                " is a coded program that can be introduced into HTML pages.\n" +
                "2. Java ia a structured programming language whereas javascript is scripting language."
        );
    }
}
