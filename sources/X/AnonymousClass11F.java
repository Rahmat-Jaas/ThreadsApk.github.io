package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape149S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.igds.components.tooltip.IDxTCallbackShape55S0200000_1_I2;
import java.util.List;

/* renamed from: X.11F  reason: invalid class name */
public final class AnonymousClass11F extends C41030Luu {
    public final Activity A00;
    public final List A01 = AnonymousClass0wJ.A0v();
    public final AnonymousClass0YY A02;
    public final AnonymousClass0YY A03;

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        LayoutInflater A0C = C18180wK.A0C(viewGroup);
        if (i == 0) {
            C04220Ms.A06(A0C);
            return new AnonymousClass1f6(this.A00, C18200wM.A0F(A0C, viewGroup, R.layout.layout_share_content_funding_item, false), this.A02, this.A03);
        } else if (i == 1) {
            C04220Ms.A06(A0C);
            return new AnonymousClass1f5(C18200wM.A0F(A0C, viewGroup, R.layout.layout_share_content_funding_item, false), this.A02);
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0J("unknown type: ", i));
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        C197111k r6 = (C197111k) m5o;
        C04220Ms.A0B(r6, 0);
        AnonymousClass17I r3 = (AnonymousClass17I) this.A01.get(i);
        if (r6 instanceof AnonymousClass1f6) {
            AnonymousClass1f6 r62 = (AnonymousClass1f6) r6;
            C04220Ms.A0B(r3, 0);
            IgdsListCell igdsListCell = r62.A01;
            if (igdsListCell != null) {
                igdsListCell.A0H(C59523Ld.A00(C18190wL.A0A(r62.itemView), r3.A03));
                igdsListCell.A0G(C59523Ld.A00(C18190wL.A0A(r62.itemView), r3.A02));
                igdsListCell.setChecked(r3.A00);
                igdsListCell.setEnabled(r3.A04);
                igdsListCell.A0C(new IDxCListenerShape149S0200000_1_I2(4, r62, r3));
            }
            if (r3.A05) {
                C25553Dnn A002 = AnonymousClass4DS.A00(r62.A00, 2131822396);
                View view = r62.itemView;
                C04220Ms.A05(view);
                C18230wP.A15(view, A002);
                A002.A0A = true;
                A002.A05 = new IDxTCallbackShape55S0200000_1_I2(0, r62, r3);
                r62.itemView.postDelayed(new C72454Of(A002.A00()), 500);
                return;
            }
            return;
        }
        AnonymousClass1f5 r63 = (AnonymousClass1f5) r6;
        C04220Ms.A0B(r3, 0);
        IgdsListCell igdsListCell2 = r63.A00;
        if (igdsListCell2 != null) {
            igdsListCell2.setChecked(r3.A00);
            igdsListCell2.A0C(new IDxCListenerShape149S0200000_1_I2(3, r63, r3));
        }
    }

    public AnonymousClass11F(Activity activity, AnonymousClass0YY r3, AnonymousClass0YY r4) {
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final int getItemCount() {
        int A032 = C14030oh.A03(-1114494464);
        int size = this.A01.size();
        C14030oh.A0A(-1462991670, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = C14030oh.A03(1448108596);
        int i2 = 1;
        if (i != this.A01.size() - 1) {
            i2 = 0;
        }
        C14030oh.A0A(45165887, A032);
        return i2;
    }
}
