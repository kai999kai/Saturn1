package com.ukraine.saturn.saturntv.magazine;

import android.annotation.SuppressLint;
import android.support.v7.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.ukraine.saturn.saturntv.magazine.function.ChoiceContextMenu;

import static com.ukraine.saturn.saturntv.magazine.staticItems.StaticItemList.*;

/**
 * The main screen of the application, with icons for selecting the category of technology.
 * Use the context menu to select a user - quick / long press
 * operator IF, restricts unused product categories.
 *
 */

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerForContextMenu(findViewById(R.id.android));
        registerForContextMenu(findViewById(R.id.beauty));
        registerForContextMenu(findViewById(R.id.climate));
        registerForContextMenu(findViewById(R.id.cloth));
        registerForContextMenu(findViewById(R.id.cold));
        registerForContextMenu(findViewById(R.id.house));
        registerForContextMenu(findViewById(R.id.kitchen));
        registerForContextMenu(findViewById(R.id.multimedia));
        registerForContextMenu(findViewById(R.id.washer));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(new ChoiceContextMenu().choice_Menu(v), menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    public void onClickContextMenu(View view) {
        openContextMenu(view);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        boolean b;
        int id = new ChoiceContextMenu().item_choice_menu(item.getItemId());

        if ((id == CHOICE_CONTEXT_PHONE) || (id == CHOICE_CONTEXT_ELECTRIC_GRILL) ||
                (id == CHOICE_CONTEXT_CHOPPER)) {
            Toast.makeText(this, "В данном разделе еще нет товара",
                    Toast.LENGTH_LONG).show();
            b = false;

        } else {
            Intent intent = new Intent(this, ListCategoryActivity.class);
            intent.putExtra("id_context_menu", id);
            startActivity(intent);
            b = true;
        }
        return b;
    }

    public void onClickAlertDialog(View view) {
        alertDialogCall();
    }


    /**
     * clicking on the company logo. Ability to write a message emil and call the service center
     */
    public void alertDialogCall() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.saturn2019).setMessage(R.string.office_number);

        builder.setPositiveButton(R.string.txPhone, (dialog, which) -> {
            String number = "tel:+380445911190";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(number)));
            finish();
        });

        builder.setNegativeButton(R.string.emil, (dialog, which) -> {
            String emil = "mailto:service@saturn.ua";
            startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse(emil)));
            finish();
        });

        builder.setNeutralButton(R.string.backwards, (dialog, which) -> {
        });

        AlertDialog dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();
    }
}
