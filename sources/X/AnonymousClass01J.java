package X;

import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.01J  reason: invalid class name */
public final class AnonymousClass01J extends AnonymousClass05O implements AnonymousClass055, AnonymousClass051 {
    public boolean A00;
    public int A01;
    public final C12560m7 A02;

    public final int A00() {
        return A0L(false);
    }

    public final int A01() {
        return A0L(true);
    }

    public final boolean ANg(ArrayList arrayList, ArrayList arrayList2) {
        C12560m7.A0E(2);
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.A0F) {
            return true;
        }
        C12560m7 r1 = this.A02;
        ArrayList arrayList3 = r1.A0D;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            r1.A0D = arrayList3;
        }
        arrayList3.add(this);
        return true;
    }

    public final AnonymousClass05O A02(Fragment fragment) {
        C12560m7 r1 = fragment.mFragmentManager;
        if (r1 == null || r1 == this.A02) {
            super.A02(fragment);
            return this;
        }
        throw new IllegalStateException(AnonymousClass00U.A0V("Cannot detach Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
    }

    public final AnonymousClass05O A03(Fragment fragment) {
        C12560m7 r1 = fragment.mFragmentManager;
        if (r1 == null || r1 == this.A02) {
            super.A03(fragment);
            return this;
        }
        throw new IllegalStateException(AnonymousClass00U.A0V("Cannot hide Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
    }

    public final AnonymousClass05O A04(Fragment fragment) {
        C12560m7 r1 = fragment.mFragmentManager;
        if (r1 == null || r1 == this.A02) {
            super.A04(fragment);
            return this;
        }
        throw new IllegalStateException(AnonymousClass00U.A0V("Cannot remove Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
    }

    public final AnonymousClass05O A05(Fragment fragment) {
        C12560m7 r1 = fragment.mFragmentManager;
        if (r1 == null || r1 == this.A02) {
            super.A05(fragment);
            return this;
        }
        throw new IllegalStateException(AnonymousClass00U.A0V("Cannot show Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
    }

    public final AnonymousClass05O A06(Fragment fragment, AnonymousClass061 r5) {
        C12560m7 r0 = fragment.mFragmentManager;
        C12560m7 r2 = this.A02;
        if (r0 != r2) {
            StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(r2);
            throw new IllegalArgumentException(sb.toString());
        } else if (r5 == AnonymousClass061.INITIALIZED && fragment.mState > -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set maximum Lifecycle to ");
            sb2.append(r5);
            sb2.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb2.toString());
        } else if (r5 != AnonymousClass061.DESTROYED) {
            super.A06(fragment, r5);
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot set maximum Lifecycle to ");
            sb3.append(r5);
            sb3.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final int A0L(boolean z) {
        int i;
        if (!this.A00) {
            if (C12560m7.A0E(2)) {
                PrintWriter printWriter = new PrintWriter(new C011105c());
                A0N(printWriter, "  ", true);
                printWriter.close();
            }
            this.A00 = true;
            if (this.A0F) {
                i = this.A02.A0Z.getAndIncrement();
            } else {
                i = -1;
            }
            this.A01 = i;
            this.A02.A0w(this, z);
            return this.A01;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void A0M(int i) {
        if (this.A0F) {
            C12560m7.A0E(2);
            ArrayList arrayList = this.A0C;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = ((AnonymousClass05N) arrayList.get(i2)).A05;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    C12560m7.A0E(2);
                }
            }
        }
    }

    public final void A0N(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A0A);
            printWriter.print(" mIndex=");
            printWriter.print(this.A01);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A00);
            if (this.A07 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.A07));
            }
            if (!(this.A03 == 0 && this.A04 == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A03));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A04));
            }
            if (!(this.A05 == 0 && this.A06 == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A05));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A06));
            }
            if (!(this.A02 == 0 && this.A09 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.A02));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A09);
            }
            if (!(this.A01 == 0 && this.A08 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.A01));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A08);
            }
        }
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass05N r4 = (AnonymousClass05N) arrayList.get(i);
                int i2 = r4.A00;
                switch (i2) {
                    case 0:
                        str2 = FXPFLinkageCacheDebugFragment.nullString;
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = AnonymousClass00U.A0J("cmd=", i2);
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(r4.A05);
                if (z) {
                    if (!(r4.A01 == 0 && r4.A02 == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(r4.A01));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A02));
                    }
                    if (r4.A03 != 0 || r4.A04 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(r4.A03));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A04));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        int i = this.A01;
        if (i >= 0) {
            sb.append(" #");
            sb.append(i);
        }
        String str = this.A0A;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass01J(X.C12560m7 r3) {
        /*
            r2 = this;
            X.04v r1 = r3.A0P()
            X.0Oi r0 = r3.A09
            if (r0 == 0) goto L_0x0017
            android.content.Context r0 = r0.A01
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L_0x000e:
            r2.<init>(r1, r0)
            r0 = -1
            r2.A01 = r0
            r2.A02 = r3
            return
        L_0x0017:
            r0 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01J.<init>(X.0m7):void");
    }

    public final void A08() {
        A07();
        this.A02.A0x(this, false);
    }

    public final void A09() {
        A07();
        this.A02.A0x(this, true);
    }

    public final void A0H(Fragment fragment, String str, int i, int i2) {
        super.A0H(fragment, str, i, i2);
        fragment.mFragmentManager = this.A02;
    }
}
