package X;

import com.facebookpay.form.cell.card.CardCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5ha  reason: invalid class name and case insensitive filesystem */
public final class C92085ha extends C91895h1 {
    public int A00;
    public ImmutableList A01;

    public C92085ha() {
        super(13);
    }

    public final TextCellParams A00() {
        super.A00();
        return new CardCellParams(this);
    }
}
