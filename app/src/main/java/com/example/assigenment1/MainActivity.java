package com.example.assigenment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public boolean winCheck(char[] board, char winner, int win) {
        if (board[1] == board[2] && board[2] == board[3]) {
            win = 123;
            board[0] = board[1];
            return true;
        } else if (board[4] == board[5] && board[5] == board[6]) {
            win = 456;
            board[0] = board[4];
            return true;
        } else if (board[7] == board[8] && board[8] == board[9]) {
            win = 789;
            board[0] = board[7];
            return true;
        } else if (board[1] == board[4] && board[4] == board[7]) {
            win = 147;
            board[0] = board[1];
            return true;
        } else if (board[2] == board[5] && board[5] == board[8]) {
            win = 258;
            board[0] = board[2];
            return true;
        } else if (board[3] == board[6] && board[6] == board[9]) {
            win = 369;
            board[0] = board[3];
            return true;
        } else if (board[3] == board[5] && board[5] == board[7]) {
            win = 357;
            board[0] = board[3];
            return true;
        } else if (board[1] == board[5] && board[5] == board[9]) {
            win = 159;
            board[0] = board[1];
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv11 = findViewById(R.id.imageView11);
        ImageView iv12 = findViewById(R.id.imageView12);
        ImageView iv13 = findViewById(R.id.imageView13);
        ImageView iv21 = findViewById(R.id.imageView21);
        ImageView iv22 = findViewById(R.id.imageView22);
        ImageView iv23 = findViewById(R.id.imageView23);
        ImageView iv31 = findViewById(R.id.imageView31);
        ImageView iv32 = findViewById(R.id.imageView32);
        ImageView iv33 = findViewById(R.id.imageView33);
        TextView turn = findViewById(R.id.turn_tv);
        char[] board = new char[10];
        int win;
        boolean xturn = true;


    }
}