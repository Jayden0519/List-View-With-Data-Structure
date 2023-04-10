package com.example.lastattemptlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import java.util.Stack;

public class StacksAdp extends MainActivity<String>
{
    private Stack<String> string;

    public StacksAdp(Context context, int resources, Stack<String> stack)
    {
        super(Context context, int resource, Stack<String> stack)
        {
            super(context, recource);
            this.stack = stack;
        }


                public int getCount()
        {
            return stack.size();
        }

                public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflator =  (LayoutInflator) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflator = rowView.findViewById(R.id.text);
            String item = stack.get(position);
            textView.setText(item);

            return rowView;
        }
    }
}
