package X;

import android.text.Editable;
import android.widget.EditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1yG  reason: invalid class name and case insensitive filesystem */
public final class C29501yG extends C64493mQ {
    public static Pattern A01 = Pattern.compile("\\A\\s+", 8);
    public static Pattern A02 = Pattern.compile("\\s+\\Z", 8);
    public EditText A00;

    public final void afterTextChanged(Editable editable) {
        Matcher matcher = A01.matcher(editable);
        if (matcher.find()) {
            EditText editText = this.A00;
            int selectionStart = editText.getSelectionStart() - matcher.group(0).length();
            editText.setText(matcher.replaceFirst(""));
            editText.setSelection(Math.max(selectionStart, 0));
        }
    }

    public C29501yG(EditText editText) {
        this.A00 = editText;
    }
}
