package com.example.pocketyoga;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class SunsaluteDialog extends AppCompatDialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Note")
                .setMessage("BENEFITS:\n\n- Become centered and grounded. \n" +
                        "- Create focus for your day. \n" +
                        "- Gain muscle and flexibility.\n" +
                        "- Leave your ego behind. \n" +
                        "- Boost the immune system and overall health. \n" +
                        "- De-stress and find inner peace.\n\nPRECAUTIONS:\n\n- Don't eat or drink immediately before and after doing Sun Salute.\n" +
                        "- Before practicing Sun Salute, an adequate warm-up should be done.\n" +
                        "- It should be properly synchronized with breathing.\n" +
                        "- If you have any medical problem, please consult your doctor.\n")
                .setPositiveButton("Noted!", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                    }
                });
        return builder.create();
    }
}

