package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.mapbox.android.accounts.v1.MapboxAccounts;
import java.util.Locale;

/* renamed from: X.7QA  reason: invalid class name */
public class AnonymousClass7QA implements TextWatcher {
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        String str;
        Locale locale;
        Object[] objArr;
        String valueOf;
        if (this instanceof C93665qr) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ((C93665qr) this).A00;
            Chip chip = chipTextInputComboView.A03;
            if (isEmpty) {
                str = "%02d";
                locale = chipTextInputComboView.getResources().getConfiguration().locale;
                objArr = new Object[1];
                valueOf = String.valueOf(MapboxAccounts.SKU_ID_MAPS_MAUS);
            } else {
                str = "%02d";
                locale = chipTextInputComboView.getResources().getConfiguration().locale;
                objArr = new Object[1];
                valueOf = String.valueOf(editable);
            }
            objArr[0] = C86124wJ.A0h(valueOf);
            chip.setText(String.format(locale, str, objArr));
        }
    }
}
