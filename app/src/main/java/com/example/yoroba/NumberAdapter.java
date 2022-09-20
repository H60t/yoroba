package com.example.yoroba;

    import android.app.Activity;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ArrayAdapter;
    import android.widget.ImageView;
    import android.widget.TextView;

    import java.security.acl.Group;
    import java.util.ArrayList;
    public class NumberAdapter extends ArrayAdapter<NumberHelper>{
        private static final String LOG_TAG=NumberAdapter.class.getSimpleName();
        public NumberAdapter(Activity context, ArrayList<NumberHelper> resource){
            super(context,0);
        }
        public View getView(int position, View view, ViewGroup group) {
            View itemView = view;
            if (itemView == null) {
                itemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_number,group,false
                );
            }
            NumberHelper currentPosition = getItem(position);
            TextView lanYoroba = itemView.findViewById(R.id.numberYoroba);
            TextView lanEnglish = itemView.findViewById(R.id.numberEnglish);
            ImageView lanImage = itemView.findViewById(R.id.numberImage);

            lanImage.setImageResource(currentPosition.getImageid());
            return itemView;


        }
    }

