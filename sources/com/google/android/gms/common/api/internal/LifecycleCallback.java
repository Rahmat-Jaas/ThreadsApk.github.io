package com.google.android.gms.common.api.internal;

import X.AnonymousClass7MI;
import X.C105036cm;
import X.C107466gn;
import X.C129157lQ;
import X.C13320nQ;
import X.C146168ll;
import X.C18180wK;
import X.C93375lV;
import X.C93505li;
import X.C93515lj;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

public class LifecycleCallback {
    public final C146168ll A00;

    public LifecycleCallback(C146168ll r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.4wj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.4wj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: X.4wj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.56K} */
    /* JADX WARNING: type inference failed for: r2v10, types: [androidx.fragment.app.Fragment, X.56K] */
    /* JADX WARNING: type inference failed for: r2v11, types: [androidx.fragment.app.Fragment, X.56K] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r2 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r0 != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2 == null) goto L_0x001c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C146168ll A01(X.C105036cm r4) {
        /*
            java.lang.Object r4 = r4.A00
            boolean r0 = r4 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0045
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.String r1 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap r3 = X.AnonymousClass56K.A03
            java.lang.Object r0 = r3.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x001c
            java.lang.Object r2 = r0.get()
            X.56K r2 = (X.AnonymousClass56K) r2
            if (r2 != 0) goto L_0x008c
        L_0x001c:
            X.0m7 r0 = r4.getSupportFragmentManager()     // Catch:{ ClassCastException -> 0x003c }
            androidx.fragment.app.Fragment r2 = r0.A0O(r1)     // Catch:{ ClassCastException -> 0x003c }
            X.56K r2 = (X.AnonymousClass56K) r2     // Catch:{ ClassCastException -> 0x003c }
            if (r2 == 0) goto L_0x002c
            boolean r0 = r2.mRemoving
            if (r0 == 0) goto L_0x0085
        L_0x002c:
            X.56K r2 = new X.56K
            r2.<init>()
            X.01J r0 = X.C18220wO.A0L(r4)
            r0.A0E(r2, r1)
            r0.A01()
            goto L_0x0085
        L_0x003c:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0045:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0096
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r1 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r3 = X.C86244wj.A03
            java.lang.Object r0 = r3.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x005f
            java.lang.Object r2 = r0.get()
            X.4wj r2 = (X.C86244wj) r2
            if (r2 != 0) goto L_0x008c
        L_0x005f:
            android.app.FragmentManager r0 = r4.getFragmentManager()     // Catch:{ ClassCastException -> 0x008d }
            android.app.Fragment r2 = r0.findFragmentByTag(r1)     // Catch:{ ClassCastException -> 0x008d }
            X.4wj r2 = (X.C86244wj) r2     // Catch:{ ClassCastException -> 0x008d }
            if (r2 == 0) goto L_0x0071
            boolean r0 = r2.isRemoving()
            if (r0 == 0) goto L_0x0085
        L_0x0071:
            X.4wj r2 = new X.4wj
            r2.<init>()
            android.app.FragmentManager r0 = r4.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r0 = r0.add(r2, r1)
            r0.commitAllowingStateLoss()
        L_0x0085:
            java.lang.ref.WeakReference r0 = X.C86144wL.A0w(r2)
            r3.put(r4, r0)
        L_0x008c:
            return r2
        L_0x008d:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0096:
            java.lang.String r0 = "Can't get fragment for unexpected activity."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A01(X.6cm):X.8ll");
    }

    public static C146168ll getChimeraLifecycleFragmentImpl(C105036cm r0) {
        throw C18180wK.A0a("Method not available in SDK.");
    }

    public final void A02() {
        if (this instanceof C93505li) {
            C93505li r1 = (C93505li) this;
            if (!r1.A00.isEmpty()) {
                r1.A01.A05(r1);
            }
        }
    }

    public final void A03() {
        if (this instanceof C93375lV) {
            C93375lV r3 = (C93375lV) this;
            if (r3 instanceof C93515lj) {
                C93515lj r32 = (C93515lj) r3;
                r32.A03 = true;
                SparseArray sparseArray = r32.A00;
                String.valueOf(String.valueOf(sparseArray));
                if (r32.A02.get() == null) {
                    for (int i = 0; i < sparseArray.size(); i++) {
                        C129157lQ A002 = C93515lj.A00(r32, i);
                        if (A002 != null) {
                            A002.A02.A05();
                        }
                    }
                }
            } else if (r3 instanceof C93505li) {
                C93505li r33 = (C93505li) r3;
                r33.A03 = true;
                if (!r33.A00.isEmpty()) {
                    r33.A01.A05(r33);
                }
            } else {
                r3.A03 = true;
            }
        }
    }

    public final void A04() {
        if (this instanceof C93375lV) {
            C93375lV r3 = (C93375lV) this;
            if (r3 instanceof C93515lj) {
                C93515lj r32 = (C93515lj) r3;
                r32.A03 = false;
                for (int i = 0; i < r32.A00.size(); i++) {
                    C129157lQ A002 = C93515lj.A00(r32, i);
                    if (A002 != null) {
                        A002.A02.A06();
                    }
                }
            } else if (r3 instanceof C93505li) {
                C93505li r33 = (C93505li) r3;
                r33.A03 = false;
                AnonymousClass7MI r2 = r33.A01;
                synchronized (AnonymousClass7MI.A0I) {
                    if (r2.A01 == r33) {
                        r2.A01 = null;
                        r2.A0A.clear();
                    }
                }
            } else {
                r3.A03 = false;
            }
        }
    }

    public final void A05(int i, int i2, Intent intent) {
        if (this instanceof C93375lV) {
            C93375lV r5 = (C93375lV) this;
            AtomicReference atomicReference = r5.A02;
            C107466gn r6 = (C107466gn) atomicReference.get();
            if (i == 1) {
                if (i2 != -1) {
                    if (i2 == 0) {
                        if (r6 != null) {
                            int i3 = 13;
                            if (intent != null) {
                                i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                            }
                            ConnectionResult connectionResult = new ConnectionResult((PendingIntent) null, r6.A01.toString(), 1, i3);
                            int i4 = r6.A00;
                            atomicReference.set((Object) null);
                            r5.A0A(connectionResult, i4);
                            return;
                        }
                        return;
                    }
                }
                atomicReference.set((Object) null);
                r5.A09();
                return;
            } else if (i == 2) {
                GoogleApiAvailability googleApiAvailability = r5.A01;
                Activity Arv = r5.A00.Arv();
                C13320nQ.A01(Arv);
                int A02 = googleApiAvailability.A02(Arv, 12451000);
                if (A02 != 0) {
                    if (r6 != null) {
                        if (r6.A01.A01 == 18 && A02 == 18) {
                            return;
                        }
                        ConnectionResult connectionResult2 = r6.A01;
                        int i5 = r6.A00;
                        atomicReference.set((Object) null);
                        r5.A0A(connectionResult2, i5);
                    }
                    return;
                }
                atomicReference.set((Object) null);
                r5.A09();
                return;
            }
            if (r6 == null) {
                return;
            }
            ConnectionResult connectionResult22 = r6.A01;
            int i52 = r6.A00;
            atomicReference.set((Object) null);
            r5.A0A(connectionResult22, i52);
        }
    }

    public final void A06(Bundle bundle) {
        C107466gn r0;
        if (this instanceof C93375lV) {
            C93375lV r02 = (C93375lV) this;
            if (bundle != null) {
                AtomicReference atomicReference = r02.A02;
                if (bundle.getBoolean("resolving_error", false)) {
                    r0 = new C107466gn(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
                } else {
                    r0 = null;
                }
                atomicReference.set(r0);
            }
        }
    }

    public final void A07(Bundle bundle) {
        C107466gn r2;
        if ((this instanceof C93375lV) && (r2 = (C107466gn) ((C93375lV) this).A02.get()) != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", r2.A00);
            ConnectionResult connectionResult = r2.A01;
            bundle.putInt("failed_status", connectionResult.A01);
            bundle.putParcelable("failed_resolution", connectionResult.A02);
        }
    }

    public final void A08(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this instanceof C93515lj) {
            C93515lj r4 = (C93515lj) this;
            for (int i = 0; i < r4.A00.size(); i++) {
                C129157lQ A002 = C93515lj.A00(r4, i);
                if (A002 != null) {
                    printWriter.append(str).append("GoogleApiClient #").print(A002.A00);
                    printWriter.println(":");
                    A002.A02.A08(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
    }
}
