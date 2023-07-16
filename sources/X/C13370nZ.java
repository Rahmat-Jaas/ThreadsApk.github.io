package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0nZ  reason: invalid class name and case insensitive filesystem */
public final class C13370nZ {
    public Integer A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public final Fragment A04;
    public final HashSet A05;
    public final List A06;
    public final AnonymousClass05H A07;

    public final void A00() {
        if (!this.A02) {
            this.A02 = true;
            HashSet hashSet = this.A05;
            if (hashSet.isEmpty()) {
                A01();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((C113806sA) it.next()).A00();
            }
        }
    }

    public final void A01() {
        if (!this.A03) {
            C12560m7.A0E(2);
            this.A03 = true;
            for (Runnable run : this.A06) {
                run.run();
            }
        }
        this.A07.A05();
    }

    public final void A02() {
        Integer num = this.A01;
        if (num == AnonymousClass006.A01) {
            AnonymousClass05H r4 = this.A07;
            Fragment fragment = r4.A02;
            View findFocus = fragment.mView.findFocus();
            if (findFocus != null) {
                fragment.setFocusedView(findFocus);
                C12560m7.A0E(2);
            }
            View requireView = this.A04.requireView();
            if (requireView.getParent() == null) {
                r4.A04();
                requireView.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            if (requireView.getAlpha() == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && requireView.getVisibility() == 0) {
                requireView.setVisibility(4);
            }
            requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
        } else if (num == AnonymousClass006.A0C) {
            View requireView2 = this.A07.A02.requireView();
            if (C12560m7.A0E(2)) {
                requireView2.findFocus();
            }
            requireView2.clearFocus();
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Operation ");
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ");
        sb.append("{");
        sb.append("mFinalState = ");
        switch (this.A00.intValue()) {
            case 0:
                str = "REMOVED";
                break;
            case 1:
                str = "VISIBLE";
                break;
            case 2:
                str = "GONE";
                break;
            default:
                str = "INVISIBLE";
                break;
        }
        sb.append(str);
        sb.append("} ");
        sb.append("{");
        sb.append("mLifecycleImpact = ");
        switch (this.A01.intValue()) {
            case 0:
                str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            case 1:
                str2 = "ADDING";
                break;
            default:
                str2 = "REMOVING";
                break;
        }
        sb.append(str2);
        sb.append("} ");
        sb.append("{");
        sb.append("mFragment = ");
        sb.append(this.A04);
        sb.append("}");
        return sb.toString();
    }

    public C13370nZ(C113806sA r2, Fragment fragment, Integer num, Integer num2) {
        this.A06 = new ArrayList();
        this.A05 = new HashSet();
        this.A02 = false;
        this.A03 = false;
        this.A00 = num;
        this.A01 = num2;
        this.A04 = fragment;
        r2.A01(new C011405g(this));
    }

    public final void A03(Integer num, Integer num2) {
        Integer num3;
        int intValue = num2.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                C12560m7.A0E(2);
                this.A00 = AnonymousClass006.A00;
                num3 = AnonymousClass006.A0C;
            } else if (intValue == 0 && this.A00 != AnonymousClass006.A00) {
                C12560m7.A0E(2);
                this.A00 = num;
                return;
            } else {
                return;
            }
        } else if (this.A00 == AnonymousClass006.A00) {
            C12560m7.A0E(2);
            num3 = AnonymousClass006.A01;
            this.A00 = num3;
        } else {
            return;
        }
        this.A01 = num3;
    }

    public C13370nZ(C113806sA r2, AnonymousClass05H r3, Integer num, Integer num2) {
        this(r2, r3.A02, num, num2);
        this.A07 = r3;
    }
}
