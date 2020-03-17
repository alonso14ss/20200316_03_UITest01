package co.kr.tjoeun.helloworld.a20200316_03_uitest01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    TextView findPwTxt = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);

//        로그인 버튼의 글자를 회원가입으로 바꾸자

        loginBtn.setText("회원가입");

//        비밀번호찾기 텍스트뷰를 java에서 비번찾기로 바꾸자

        findPwTxt = findViewById(R.id.findPwTxt);

        findPwTxt.setText("비번찾기");


    }
}
