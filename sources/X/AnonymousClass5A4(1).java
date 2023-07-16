package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5A4  reason: invalid class name */
public final class AnonymousClass5A4 extends C41030Luu {
    public List A00 = AnonymousClass0ZV.A00;

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return new AnonymousClass5Ao(new IgdsListCell(C18190wL.A0A(viewGroup), (AttributeSet) null));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        int i2;
        AnonymousClass5Ao r9 = (AnonymousClass5Ao) m5o;
        C04220Ms.A0B(r9, 0);
        KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1 = (KtCSuperShape1S0200000_I2_1) this.A00.get(i);
        C148478r8 Axc = ((C148288qm) ktCSuperShape1S0200000_I2_1.A01).Axc();
        if (Axc != null) {
            String format = new SimpleDateFormat(AnonymousClass000.A00(266), C31103Gfm.A02()).format(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(Axc.B0O()));
            IgdsListCell igdsListCell = r9.A00;
            C148278ql B0W = Axc.B0W();
            if (B0W != null) {
                igdsListCell.A0H(String.valueOf(B0W.AjX()));
                Locale A02 = C31103Gfm.A02();
                Context context = igdsListCell.getContext();
                C966866h B0Y = Axc.B0Y();
                if (B0Y != null) {
                    switch (B0Y.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            i2 = 2131832316;
                            break;
                        case 7:
                            i2 = 2131832315;
                            break;
                    }
                }
                i2 = 2131832309;
                igdsListCell.A0G(C86154wM.A0o(A02, "%s %s", C86144wL.A1a(format, context.getString(i2))));
                igdsListCell.setTextCellType(AnonymousClass24V.TYPE_CHEVRON);
                igdsListCell.setOnClickListener((View.OnClickListener) ktCSuperShape1S0200000_I2_1.A00);
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(934835388);
        int size = this.A00.size();
        C14030oh.A0A(212370632, A03);
        return size;
    }
}
