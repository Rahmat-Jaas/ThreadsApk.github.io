package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0200000_I2_5;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;

/* renamed from: X.1Yf  reason: invalid class name and case insensitive filesystem */
public abstract class C22471Yf extends C34640IcN {
    public static final String __redex_internal_original_name = "EventResponseSelectorBaseFragment";
    public IgdsListCell A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public String A03;
    public final C04530Oa A04 = C80644m9.A00(this);

    public final void onViewCreated(View view, Bundle bundle) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener3;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.button_going);
        this.A01 = igdsListCell;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(AnonymousClass24V.TYPE_RADIO);
        }
        IgdsListCell igdsListCell2 = this.A01;
        if (igdsListCell2 != null) {
            if (this instanceof AnonymousClass1p5) {
                onCheckedChangeListener3 = ((AnonymousClass1p5) this).A01;
            } else {
                onCheckedChangeListener3 = ((AnonymousClass1p6) this).A01;
            }
            igdsListCell2.A0C(onCheckedChangeListener3);
        }
        IgdsListCell igdsListCell3 = (IgdsListCell) view.requireViewById(R.id.button_maybe);
        this.A02 = igdsListCell3;
        if (igdsListCell3 != null) {
            igdsListCell3.setTextCellType(AnonymousClass24V.TYPE_RADIO);
        }
        IgdsListCell igdsListCell4 = this.A02;
        if (igdsListCell4 != null) {
            if (this instanceof AnonymousClass1p5) {
                onCheckedChangeListener2 = ((AnonymousClass1p5) this).A02;
            } else {
                onCheckedChangeListener2 = ((AnonymousClass1p6) this).A02;
            }
            igdsListCell4.A0C(onCheckedChangeListener2);
        }
        IgdsListCell igdsListCell5 = (IgdsListCell) view.requireViewById(R.id.button_cant_go);
        this.A00 = igdsListCell5;
        if (igdsListCell5 != null) {
            igdsListCell5.setTextCellType(AnonymousClass24V.TYPE_RADIO);
        }
        IgdsListCell igdsListCell6 = this.A00;
        if (igdsListCell6 != null) {
            if (this instanceof AnonymousClass1p5) {
                onCheckedChangeListener = ((AnonymousClass1p5) this).A00;
            } else {
                onCheckedChangeListener = ((AnonymousClass1p6) this).A00;
            }
            igdsListCell6.A0C(onCheckedChangeListener);
        }
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r4, (Object) this, (C146958n9) null, 38), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final void A00(C83224qz r6) {
        if (this instanceof AnonymousClass1p5) {
            AnonymousClass1p5 r4 = (AnonymousClass1p5) this;
            C04220Ms.A0B(r6, 0);
            C18230wP.A1T(new KtSLambdaShape10S0200000_I2_5(r4, (C146958n9) null, 14), r6, ((C19340zi) r4.A03.getValue()).A01);
            return;
        }
        AnonymousClass1p6 r42 = (AnonymousClass1p6) this;
        C04220Ms.A0B(r6, 0);
        C18230wP.A1T(new KtSLambdaShape10S0200000_I2_5(r42, (C146958n9) null, 12), r6, ((AnonymousClass10G) r42.A03.getValue()).A02);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-461706956);
        super.onCreate(bundle);
        this.A03 = C18220wO.A0j(this);
        C14030oh.A09(-2052386602, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-928359625);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.event_respond_bottomsheet_fragment, viewGroup, false);
        C14030oh.A09(-1815101973, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1963717296);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        C14030oh.A09(-730092448, A022);
    }
}
