package com.instagram.debug.devoptions;

import X.C09860go;
import X.C14030oh;
import android.view.View;
import android.widget.EditText;

public final class DeveloperLoggingHostFragment$onCreateView$2 implements View.OnClickListener {
    public final /* synthetic */ EditText $editText;

    public DeveloperLoggingHostFragment$onCreateView$2(EditText editText) {
        this.$editText = editText;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1149676287);
        this.$editText.setText(DeveloperLoggingHostFragment.OD_TEMPLATE_ADDRESS);
        this.$editText.requestFocus();
        C09860go.A0K(this.$editText);
        this.$editText.setSelection(13);
        C14030oh.A0C(-387933344, A05);
    }
}
