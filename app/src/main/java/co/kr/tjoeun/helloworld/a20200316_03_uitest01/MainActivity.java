package co.kr.tjoeun.helloworld.a20200316_03_uitest01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

//        로그인 버튼이 눌리면 비번찾기 이름을 AAAA로 연결

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findPwTxt.setText("AAA");

            }
        });

//        클릭은 버튼 뿐 아니라 모든 뷰가 다 눌릴 수 있다 . => 텍스트뷰도 클릭

        findPwTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findPwTxt.setText("비밀번호 찾기");
            }
        });

        loginBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                loginBtn.setText("로그인");
                return true; // 손을 뗐을때, 온클릭실행을 막을건지
            }
        });

    }
}
