package com.example.master.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    TextView mTextView;


    PopupMenu.OnMenuItemClickListener mPopupListener=new PopupMenu.OnMenuItemClickListener() {//листенер для пунктов меню
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()){
                case R.id.oneIn2:
                mTextView.setText("ONNNNe");
                break;
                case R.id.menu2:
                    mTextView.setText("Twoo");
                    break;
                case R.id.oneIn1:
                    mTextView.setText("One1");
                    break;

            }
            return true;
        }
    };
    View.OnLongClickListener onLongClickListener=new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            showPopup(v);
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=(Button)findViewById(R.id.buttonPop);
        mButton.setOnLongClickListener(onLongClickListener);
        mTextView=(TextView)findViewById(R.id.textViewPOp);
        mTextView.setOnLongClickListener(onLongClickListener);

            }

            private void showPopup(View v){
                PopupMenu popupMenu=new PopupMenu(this,v);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(mPopupListener);
            }

    /*public void onClickOne(MenuItem item) {
        Toast toast=Toast.makeText(getApplicationContext(),"One",Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickTwo(MenuItem item) {
        Toast toast=Toast.makeText(getApplicationContext(),"Twoo",Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickButton(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"Button",Toast.LENGTH_LONG);
        toast.show();

    }*/



}
