package layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import edu.kiet.www.epoque2017.Home;
import edu.kiet.www.epoque2017.R;
import jp.wasabeef.blurry.Blurry;


public class LoginFragment extends Fragment {
 private View parentView;

Button login;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        parentView=inflater.inflate(R.layout.fragment_login, container, false);
        login=(Button)parentView.findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),Home.class));
            }
        });

        return parentView;
    }



}