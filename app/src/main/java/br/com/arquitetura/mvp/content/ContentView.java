package br.com.arquitetura.mvp.content;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.arquitetura.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *
 * Created by enzo.teles on 25/07/2017.
 */

public class ContentView extends Fragment implements OnContentMVP.OnContentView{

    @BindView(R.id.toolbar)
    public Toolbar toolbar;
    @BindView(R.id.edt_nome)
    public EditText nome;
    @BindView(R.id.edt_senha)
    public EditText senha;
    @BindView(R.id.btn_send)
    public Button btnSend;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.content, container, false);
        ButterKnife.bind(this, view);
        //insert toolbar
        initToolbar();
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "click...", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

    private void initToolbar() {
        //toolbar.setTitle("ContentView");
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
    }

}
