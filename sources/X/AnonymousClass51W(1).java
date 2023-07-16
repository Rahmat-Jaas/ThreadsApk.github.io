package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.51W  reason: invalid class name */
public final class AnonymousClass51W extends FrameLayout {
    public int A00;
    public int A01;
    public AnonymousClass50N A02;
    public SpritesheetInfo A03;
    public boolean A04;
    public float[] A05;
    public AnonymousClass7IR A06;
    public final int A07;
    public final FrameLayout A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final int A0D;
    public final int A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass51W(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
        View findViewById = LayoutInflater.from(context).inflate(R.layout.insights_line_chart_layout, this).findViewById(R.id.insights_line_chart_container);
        if (findViewById != null) {
            this.A08 = (FrameLayout) findViewById;
            this.A07 = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            this.A0E = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
            this.A0D = C18210wN.A02(context);
            this.A0A = AnonymousClass0wJ.A0v();
            this.A0C = AnonymousClass0wJ.A0v();
            this.A09 = AnonymousClass0wJ.A0v();
            this.A0B = AnonymousClass0wJ.A0v();
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final int A00(AnonymousClass51W r6, float f, boolean z) {
        float[] fArr;
        int i = 0;
        if (z) {
            fArr = ((AnonymousClass50T) r6.A09.get(0)).getXPositions();
        } else {
            fArr = r6.A05;
        }
        if (fArr == null) {
            return -1;
        }
        float f2 = f - ((float) (r6.A07 + r6.A0D));
        if (f2 > fArr[0]) {
            int length = fArr.length;
            i = length - 1;
            if (f2 < fArr[i]) {
                for (int i2 = 1; i2 < length; i2++) {
                    float f3 = fArr[i2];
                    if (f2 < f3) {
                        int i3 = i2 - 1;
                        if (C86124wJ.A01(f2, fArr[i3]) < C86124wJ.A01(f2, f3)) {
                            return i3;
                        }
                        return i2;
                    }
                }
                return -1;
            }
        }
        return i;
    }

    public final void A03() {
        this.A08.removeAllViews();
        if (this.A02 != null) {
            this.A02 = null;
        }
        AnonymousClass7IR r0 = this.A06;
        if (r0 != null) {
            r0.A07.dismiss();
            this.A06 = null;
        }
        setOnTouchListener((View.OnTouchListener) null);
        this.A0B.clear();
        this.A0A.clear();
        this.A0C.clear();
    }

    public final void A04() {
        AnonymousClass50N r1 = this.A02;
        if (r1 != null) {
            this.A08.removeView(r1);
            this.A02 = null;
        }
        List<View> list = this.A0B;
        if (!list.isEmpty()) {
            for (View removeView : list) {
                this.A08.removeView(removeView);
            }
            list.clear();
        }
        AnonymousClass7IR r0 = this.A06;
        if (r0 != null) {
            r0.A07.dismiss();
            this.A06 = null;
        }
    }

    public final void A05(int i) {
        AnonymousClass7IR r0 = this.A06;
        if (r0 == null) {
            Context A0A2 = C18190wL.A0A(this);
            int length = ((AnonymousClass50T) this.A09.get(0)).getXPositions().length;
            List list = this.A0A;
            float[] fArr = ((C111236n0) list.get(0)).A09;
            if (fArr != null) {
                this.A06 = new AnonymousClass7IR(A0A2, new C109996kx(this.A03, fArr, ((C111236n0) list.get(0)).A0A, length), this, i);
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
        r0.A04(i);
    }

    public final void A06(C107946hZ r7, List list, List list2, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        AnonymousClass50P r2 = new AnonymousClass50P(C18190wL.A0A(this));
        r2.setRulersAndMarks(r7);
        this.A05 = r2.getXMarksPositions();
        FrameLayout frameLayout = this.A08;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(0);
        frameLayout.addView(r2, layoutParams);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass50T A022 = A02((C111236n0) it.next(), this);
            int i3 = this.A07;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.setMarginStart(i3);
            frameLayout.addView(A022, layoutParams2);
            this.A09.add(A022);
        }
        this.A0A.addAll(list);
        this.A0C.addAll(list2);
    }

    public final void A07(C110446lh r6) {
        AnonymousClass50N r1 = this.A02;
        if (r1 != null) {
            this.A08.removeView(r1);
            this.A02 = null;
        }
        AnonymousClass50N r12 = new AnonymousClass50N(C18190wL.A0A(this));
        this.A02 = r12;
        r12.A01 = r6;
        r12.A02 = new float[C18220wO.A0S(r6.A04).size()];
        FrameLayout frameLayout = this.A08;
        AnonymousClass50N r3 = this.A02;
        int i = this.A0E;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(i);
        frameLayout.addView(r3, layoutParams);
    }

    public static final C110446lh A01(AnonymousClass51W r9, int i, boolean z) {
        float[] fArr;
        int i2;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        List<C111236n0> list = r9.A0A;
        int i3 = i;
        if (C18190wL.A1a(list)) {
            for (C111236n0 r1 : list) {
                A0v.add(new C107956ha(r1.A0A[i], r1.A05));
            }
        }
        List<C111236n0> list2 = r9.A0C;
        if (C18190wL.A1a(list2)) {
            for (C111236n0 r12 : list2) {
                A0v.add(new C107956ha(r12.A0A[i], r12.A05));
            }
        }
        if (z) {
            fArr = ((AnonymousClass50T) r9.A09.get(0)).getXPositions();
        } else {
            fArr = r9.A05;
        }
        if (fArr != null) {
            i2 = fArr.length;
        } else {
            i2 = 0;
        }
        return new C110446lh(A0v, (float) r9.A01, (float) r9.A00, i2, i3);
    }

    public static final AnonymousClass50T A02(C111236n0 r3, AnonymousClass51W r4) {
        AnonymousClass50T r2 = new AnonymousClass50T(C18190wL.A0A(r4));
        C04220Ms.A0B(r3, 0);
        r2.A04 = r3;
        r2.A0E.setColor(r3.A05);
        r2.A0C.setColor(r3.A07);
        r2.A07 = r3.A09;
        float[] fArr = r3.A0A;
        r2.A09 = fArr;
        if (fArr == null) {
            C04220Ms.A0E("yValues");
            throw null;
        }
        int length = fArr.length;
        r2.A03 = length;
        r2.A06 = new float[length];
        r2.A08 = new float[length];
        if (r3.A08) {
            r2.A05 = true;
            r2.A0D.setColor(r3.A04);
            r2.A0B.setColor(r3.A06);
        }
        return r2;
    }

    public final void setIsRetentionChart(boolean z) {
        this.A04 = z;
    }

    public final void setSpriteSheetInfo(SpritesheetInfo spritesheetInfo) {
        this.A03 = spritesheetInfo;
    }
}
