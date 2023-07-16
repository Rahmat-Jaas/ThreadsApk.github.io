package com.google.android.material.timepicker;

import X.C18180wK;
import X.C86114wI;
import X.C93665qr;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.barcelona.R;

public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public TextWatcher A00;
    public TextView A01;
    public final EditText A02;
    public final Chip A03;
    public final TextInputLayout A04;

    public final boolean isChecked() {
        return this.A03.isChecked();
    }

    public final void setChecked(boolean z) {
        Chip chip = this.A03;
        chip.setChecked(z);
        EditText editText = this.A02;
        int i = 0;
        int i2 = 4;
        if (z) {
            i2 = 0;
        }
        editText.setVisibility(i2);
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            editText.requestFocus();
            if (!TextUtils.isEmpty(editText.getText())) {
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.A03.setTag(i, obj);
    }

    public final void toggle() {
        this.A03.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.A03 = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        this.A04 = textInputLayout;
        EditText editText = textInputLayout.A0F;
        this.A02 = editText;
        editText.setVisibility(4);
        C93665qr r0 = new C93665qr(this);
        this.A00 = r0;
        editText.addTextChangedListener(r0);
        this.A02.setImeHintLocales(C86114wI.A0B(getContext()).getLocales());
        addView(chip);
        addView(textInputLayout);
        this.A01 = C18180wK.A0G(this, R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02.setImeHintLocales(C86114wI.A0B(getContext()).getLocales());
    }

    public ChipTextInputComboView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
