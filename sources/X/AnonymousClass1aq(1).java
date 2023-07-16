package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0700000_I2;
import kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44;

/* renamed from: X.1aq  reason: invalid class name */
public final class AnonymousClass1aq extends C34640IcN implements C11630kW {
    public static final String __redex_internal_original_name = "ChannelDurationSelectorFragment";
    public AnonymousClass34D A00;
    public C312624x A01;
    public boolean A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C04530Oa A04;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass0wJ.A0K(view, R.id.channel_duration_chooser_indefinite_option);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass0wJ.A0K(view, R.id.channel_duration_chooser_1_month_option);
        IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass0wJ.A0K(view, R.id.channel_duration_chooser_1_day_option);
        IgdsListCell igdsListCell4 = (IgdsListCell) AnonymousClass0wJ.A0K(view, R.id.channel_duration_chooser_1_week_option);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.options_description);
        C312624x r5 = this.A01;
        if (r5 != null) {
            int i = 0;
            int i2 = 8;
            if (r5 == C312624x.INDEFINITE) {
                i2 = 0;
            }
            igdsListCell.setVisibility(i2);
            C312624x r1 = this.A01;
            if (r1 != null) {
                if (r1 != C312624x.ONE_MONTH) {
                    i = 8;
                }
                igdsListCell2.setVisibility(i);
                igdsListCell.A06(2131825843);
                igdsListCell2.A06(2131825835);
                igdsListCell3.A06(2131825837);
                igdsListCell4.A06(2131825836);
                AnonymousClass24V r0 = AnonymousClass24V.TYPE_RADIO;
                igdsListCell.A0F(r0, true);
                igdsListCell2.A0F(r0, true);
                igdsListCell3.A0F(r0, true);
                igdsListCell4.A0F(r0, true);
                igdsListCell.A0C(new IDxCListenerShape267S0100000_1_I2((Object) this, 17));
                igdsListCell2.A0C(new IDxCListenerShape267S0100000_1_I2((Object) this, 18));
                igdsListCell3.A0C(new IDxCListenerShape267S0100000_1_I2((Object) this, 19));
                igdsListCell4.A0C(new IDxCListenerShape267S0100000_1_I2((Object) this, 20));
                AnonymousClass3J3.A01(this, new KtSLambdaShape1S0700000_I2(igdsListCell3, igdsListCell, this, A0K, igdsListCell4, igdsListCell2, (C146958n9) null, 3), ((C19410zp) this.A04.getValue()).A01);
                return;
            }
        }
        C04220Ms.A0E("initialOption");
        throw null;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public AnonymousClass1aq() {
        KtLambdaShape64S0100000_I2_44 ktLambdaShape64S0100000_I2_44 = new KtLambdaShape64S0100000_I2_44(this, 14);
        C04530Oa A0z = C18220wO.A0z(AnonymousClass006.A0C, new KtLambdaShape64S0100000_I2_44(this, 11), 12);
        this.A04 = C18220wO.A0M(new KtLambdaShape64S0100000_I2_44(A0z, 13), ktLambdaShape64S0100000_I2_44, C18250wR.A0d(A0z, (Object) null, 14), C18210wN.A0l(C19410zp.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(903797573);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_channel_duration_chooser, false);
        C14030oh.A09(254150434, A022);
        return A0D;
    }
}
