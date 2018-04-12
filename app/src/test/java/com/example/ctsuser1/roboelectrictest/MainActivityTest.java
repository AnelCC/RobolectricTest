package com.example.ctsuser1.roboelectrictest;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.robolectric.Robolectric.setupActivity;


/**
 * Created by anel on 3/20/18.
 */
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity mainActivity;
    private TextView labelHelloWord;
    private Button bnt_change, btn_input;
    private EditText editText;

    @Before
    public void setUp(){
        mainActivity = setupActivity(MainActivity.class);
        labelHelloWord = mainActivity.findViewById(R.id.tv_hello);
        bnt_change = mainActivity.findViewById(R.id.btn_change);
        btn_input = mainActivity.findViewById(R.id.btn_input);
        editText = mainActivity.findViewById(R.id.edt_input);

    }


    @Test
    public void shouldHaveATextFieldThatDisplayHelloWord() throws Exception {
        String aux = "Hello World!";
        assertThat(labelHelloWord.getText().toString(), is(aux));
    }


    @Test
    public void shouldHaveReturHelloAnel()  throws Exception{
        bnt_change.performClick();
        assertThat(labelHelloWord.getText().toString(), is("Hello Anel"));
    }

    @Test
    public void shouldHaveReturnTextFromInput()  throws Exception{
        editText.setText("This app is fun!");
        btn_input.performClick();
        assertThat(labelHelloWord.getText().toString(), is("This app is fun!"));
    }
    @Test
    public void shouldHaveReturnEmpty()  throws Exception{
        btn_input.performClick();
        assertThat(labelHelloWord.getText().toString(), is(""));;
    }
    //You can test this TDD in the terminal with the next command './gradlew test'
}