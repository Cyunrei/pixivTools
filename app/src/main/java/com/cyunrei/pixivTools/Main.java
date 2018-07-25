package com.cyunrei.pixivTools;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Button btn1 = (Button) findViewById(R.id.btn1);
		
		btn1.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					final EditText edit = new EditText(Main.this);
					
					
					
					AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);
					
					builder.setTitle(getString(R.string.dialog1_title));
					builder.setView(edit);
					builder.setPositiveButton(getString(R.string.search), new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
								Uri uri = Uri.parse(getString(R.string.dialog1_uri)+edit.getText().toString());  
								
								Intent inten1 = new Intent(Intent.ACTION_VIEW,uri);
								startActivity(inten1);
							}
						});
					builder.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
							
							}
						});
					builder.setCancelable(true);
					
					AlertDialog dialog = builder.create();
					
					dialog.setCanceledOnTouchOutside(true);
					dialog.show();
					
					
				}
			});
			
		Button btn2 = (Button) findViewById(R.id.btn2);

		btn2.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					final EditText edit = new EditText(Main.this);

					AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);

					builder.setTitle(getString(R.string.dialog2_title));
					builder.setView(edit);
					builder.setPositiveButton(getString(R.string.search), new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
								Uri uri = Uri.parse(getString(R.string.dialog2_uri)+edit.getText().toString());  

								Intent inten1 = new Intent(Intent.ACTION_VIEW,uri);
								startActivity(inten1);
							}
						});
					builder.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{

							}
						});
					builder.setCancelable(true);

					AlertDialog dialog = builder.create();

					dialog.setCanceledOnTouchOutside(true);
					dialog.show();


				}
			});
			
		Button btn3 = (Button) findViewById(R.id.btn3);

		btn3.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					final EditText edit = new EditText(Main.this);

					AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);

					builder.setTitle(getString(R.string.dialog3_title));
					builder.setView(edit);
					builder.setPositiveButton(getString(R.string.search), new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
								Uri uri = Uri.parse(getString(R.string.dialog3_uri)+edit.getText().toString());  

								Intent inten1 = new Intent(Intent.ACTION_VIEW,uri);
								startActivity(inten1);
							}
						});
					builder.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{

							}
						});
					builder.setCancelable(true);

					AlertDialog dialog = builder.create();

					dialog.setCanceledOnTouchOutside(true);
					dialog.show();


				}
			});
			
    }
}
