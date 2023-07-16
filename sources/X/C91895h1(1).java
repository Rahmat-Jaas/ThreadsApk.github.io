package X;

import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5h1  reason: invalid class name and case insensitive filesystem */
public class C91895h1 extends C110616lz {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03;
    public TextFormatter A04;
    public TextFieldHandler A05;
    public FBPayIcon A06;
    public ImmutableList A07;
    public Boolean A08 = false;
    public Boolean A09 = false;
    public Boolean A0A = false;
    public Boolean A0B = false;
    public Integer A0C = AnonymousClass006.A0N;
    public String A0D;
    public String A0E;
    public String A0F;
    public final ImmutableList.Builder A0G = C86164wN.A0Q();

    public TextCellParams A00() {
        this.A07 = this.A0G.build();
        return new TextCellParams(this);
    }

    public C91895h1(int i) {
        super(i);
    }
}
