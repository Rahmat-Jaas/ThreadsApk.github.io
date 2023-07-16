package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.5fN  reason: invalid class name and case insensitive filesystem */
public final class C90965fN extends M5L implements L1i {
    public static final C117976zY A05 = new C117976zY();
    public static final Mcm A06 = new C127667hW();
    public static final C127677hX A07 = new C127677hX();
    public static final C127687hY A08 = new C127687hY();
    public static final C127867hq A09 = new C127867hq();
    public final C91075fY A00;
    public final AnonymousClass3HX A01;
    public final C127397h3 A02;
    public final C109326jp A03;
    public final long A04;

    public final boolean A0L() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        C04220Ms.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        InlineSearchBox inlineSearchBox = new InlineSearchBox(context, (AttributeSet) null, 0);
        inlineSearchBox.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        linearLayout.addView(inlineSearchBox);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setItemAnimator((M0E) null);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        C18190wL.A1D(recyclerView);
        linearLayout.addView(recyclerView);
        return linearLayout;
    }

    public final /* synthetic */ C41788Mcl BsR() {
        return C35570Ixq.A00(this);
    }

    public C90965fN(C91075fY r6, AnonymousClass3HX r7, C127397h3 r8, long j) {
        super(AnonymousClass006.A01);
        this.A01 = r7;
        this.A00 = r6;
        this.A04 = j;
        this.A02 = r8;
        this.A03 = r8.A0L(38);
        A0K(new Lr9(A06, this), new Lr9(A08, this), new Lr9(A09, this), new Lr9(A07, this));
    }

    public final long A08() {
        return this.A04;
    }

    public final L1i A09() {
        return this;
    }

    public final /* synthetic */ boolean ABx() {
        return false;
    }

    public final /* synthetic */ boolean BXl() {
        return false;
    }

    public final /* synthetic */ int CWo() {
        return 3;
    }

    public final /* synthetic */ Object AG7(Context context) {
        return AFU(context);
    }

    public final /* synthetic */ C41788Mcl AGD() {
        return BsR();
    }

    public final /* synthetic */ Object B2C() {
        return getClass();
    }
}
