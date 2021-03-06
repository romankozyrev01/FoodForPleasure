package Listners;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.Arrays;

public class ListnerOnTextChange implements TextWatcher {
    private Context context;
    private EditText editText;
    private int currentLength = 0;

    public ListnerOnTextChange(Context context, EditText editText){
        super();
        this.editText = editText;
        this.context = context;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        boolean isEntrence;


        isEntrence = currentLength < s.length();

        System.out.println(currentLength);
        System.out.println(s.length());

        if(s.length() == 2 && isEntrence){
            editText.setText(s + "/");
        }
        else if(s.length() == 5 && isEntrence){
            editText.setText(s + "/");
        }
        currentLength = s.length();
        Selection.moveToRightEdge(editText.getText(),editText.getLayout());
    }
}
