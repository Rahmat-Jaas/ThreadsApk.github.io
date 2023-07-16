package X;

import android.util.SparseArray;
import com.facebook.common.locale.LocaleMember;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.form.model.FormField;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.57n  reason: invalid class name and case insensitive filesystem */
public final class C883057n extends C62793ak {
    public C1198277d A00;
    public ImmutableList A01;
    public final C880756q A02 = C880756q.A01();
    public final C880756q A03 = C880756q.A01();
    public final C880856r A04 = C880856r.A03();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.7Ih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.7Ih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.7Ih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.7Ih} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7Ih A01(int r5) {
        /*
            r4 = this;
            com.google.common.collect.ImmutableList r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "cellViewModels"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x000c:
            java.util.Iterator r2 = r0.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.7Ih r0 = (X.AnonymousClass7Ih) r0
            int r0 = r0.A02
            if (r0 != r5) goto L_0x0010
            r3 = r1
        L_0x0022:
            X.7Ih r3 = (X.AnonymousClass7Ih) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C883057n.A01(int):X.7Ih");
    }

    public final void A02(C1198277d r7, ImmutableList immutableList) {
        M5J m5j;
        M5J m5j2;
        C880856r r4 = this.A04;
        r4.A0H(immutableList);
        this.A00 = r7;
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 != null && !immutableList2.isEmpty()) {
            ImmutableList immutableList3 = this.A01;
            if (immutableList3 == null) {
                C04220Ms.A0E("cellViewModels");
                throw null;
            }
            C1366783w it = immutableList3.iterator();
            while (it.hasNext()) {
                AnonymousClass7Ih r2 = (AnonymousClass7Ih) it.next();
                C880756q r1 = this.A02;
                if (r2 instanceof C92055hW) {
                    m5j2 = ((C92055hW) r2).A01;
                } else {
                    m5j2 = r2.A06;
                }
                r1.A0J(m5j2);
                r2.A0G();
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        Object A08 = r4.A08();
        if (A08 != null) {
            C1366783w it2 = ((ImmutableCollection) A08).iterator();
            while (it2.hasNext()) {
                CellParams cellParams = (CellParams) it2.next();
                AnonymousClass7Ih A012 = cellParams.A01();
                cellParams.A00 = A012;
                A012.A0H(this.A00);
                C880756q r22 = this.A02;
                if (A012 instanceof C92055hW) {
                    m5j = ((C92055hW) A012).A01;
                } else {
                    m5j = A012.A06;
                }
                C880856r.A05(m5j, r22, this, 82);
                builder.add((Object) A012);
                C880856r.A05(A012.A05, this.A03, this, 83);
            }
            this.A01 = C18250wR.A0F(builder);
            C86114wI.A1B(this.A03, A05());
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final boolean A03() {
        boolean z;
        boolean z2;
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            C04220Ms.A0E("cellViewModels");
            throw null;
        }
        C1366783w it = immutableList.iterator();
        while (it.hasNext()) {
            AnonymousClass7Ih r4 = (AnonymousClass7Ih) it.next();
            if (r4 instanceof C91925hJ) {
                z2 = C18240wQ.A1Y(r4.A04.get(r4.A02), AnonymousClass7Ih.A0C(r4));
            } else {
                if (r4 instanceof C92005hR) {
                    C92005hR r42 = (C92005hR) r4;
                    if (r42.A0Q) {
                        z2 = !C121687Hl.A03((CharSequence) AnonymousClass7Ih.A0C(r42));
                    } else {
                        TextFieldHandler textFieldHandler = r42.A0J;
                        String A0m = C86114wI.A0m(r42.A04, r42.A02);
                        String str = (String) AnonymousClass7Ih.A0C(r42);
                        if (textFieldHandler != null) {
                            z2 = textFieldHandler.BO4(A0m, str);
                        } else {
                            z = C121687Hl.A04(A0m, str);
                        }
                    }
                } else if (r4 instanceof C91955hM) {
                    z2 = !C121687Hl.A04(C86114wI.A0m(r4.A04, r4.A02), (String) AnonymousClass7Ih.A0C(r4));
                } else if (r4 instanceof C91975hO) {
                    String iSO3Country = ((LocaleMember) C86124wJ.A0k(r4.A04, r4.A02)).A00.getISO3Country();
                    Object A0C = AnonymousClass7Ih.A0C(r4);
                    A0C.getClass();
                    z2 = !C121687Hl.A04(iSO3Country, ((LocaleMember) A0C).A00.getISO3Country());
                } else if (r4 instanceof C91945hL) {
                    z2 = C18240wQ.A1Y(r4.A04.get(r4.A02), AnonymousClass7Ih.A0C(r4));
                } else if (r4 instanceof C91995hQ) {
                    z2 = C18240wQ.A1Y(r4.A04.get(r4.A02), AnonymousClass7Ih.A0C(r4));
                } else if (r4 instanceof C92035hU) {
                    C92035hU r43 = (C92035hU) r4;
                    SparseArray A0B = C92055hW.A0B(r43);
                    if (!r43.A0C) {
                        SparseArray sparseArray = r43.A04;
                        if (!AnonymousClass7Ih.A0D(sparseArray, A0B, 13) || !AnonymousClass7Ih.A0D(sparseArray, A0B, 14)) {
                            return true;
                        }
                        TextFieldHandler textFieldHandler2 = r43.A00;
                        if (textFieldHandler2 != null) {
                            if (textFieldHandler2.BO4(C86114wI.A0m(sparseArray, 15), C86114wI.A0m(A0B, 15))) {
                                return true;
                            }
                        } else if (!AnonymousClass7Ih.A0D(sparseArray, A0B, 15)) {
                            return true;
                        }
                        if (!AnonymousClass7Ih.A0D(sparseArray, A0B, 20) || !AnonymousClass7Ih.A0D(sparseArray, A0B, 21)) {
                            return true;
                        }
                        z = AnonymousClass7Ih.A0D(sparseArray, A0B, 2);
                    } else if (!C121687Hl.A03(C86114wI.A0m(A0B, 13)) || !C121687Hl.A03(C86114wI.A0m(A0B, 14)) || !C121687Hl.A03(C86114wI.A0m(A0B, 15)) || !AnonymousClass7Ih.A0D(r43.A04, A0B, 21)) {
                        return true;
                    } else {
                        z = C121687Hl.A03(C86114wI.A0m(A0B, 2));
                    }
                } else if (r4 instanceof C92015hS) {
                    SparseArray A0B2 = C92055hW.A0B(r4);
                    SparseArray sparseArray2 = r4.A04;
                    if (!C121687Hl.A04(((LocaleMember) C86124wJ.A0k(sparseArray2, 10)).A00.getISO3Country(), ((LocaleMember) C86124wJ.A0k(A0B2, 10)).A00.getISO3Country())) {
                        return true;
                    }
                    z = AnonymousClass7Ih.A0D(sparseArray2, A0B2, 9);
                } else if (r4 instanceof C92045hV) {
                    C92045hV r44 = (C92045hV) r4;
                    SparseArray A0B3 = C92055hW.A0B(r44);
                    Locale locale = ((LocaleMember) C86124wJ.A0k(A0B3, 10)).A00;
                    FormCountry A012 = AnonymousClass7BH.A01(locale.getCountry(), r44.A0B.A01);
                    A012.getClass();
                    List<FormField> list = A012.A01;
                    boolean contains = list.contains("neighborhood");
                    boolean contains2 = list.contains("subdistrict");
                    SparseArray sparseArray3 = r44.A04;
                    String iSO3Country2 = ((LocaleMember) C86124wJ.A0k(sparseArray3, 10)).A00.getISO3Country();
                    String iSO3Country3 = locale.getISO3Country();
                    if (!r44.A0D) {
                        String A0m2 = C86114wI.A0m(sparseArray3, 2);
                        String A0m3 = C86114wI.A0m(A0B3, 2);
                        if (A0m3 == null) {
                            A0m3 = "";
                        }
                        if (!C121687Hl.A04(A0m2, A0m3)) {
                            return true;
                        }
                        String A0m4 = C86114wI.A0m(sparseArray3, 5);
                        String A0m5 = C86114wI.A0m(A0B3, 5);
                        if (A0m5 == null) {
                            A0m5 = "";
                        }
                        if (!C121687Hl.A04(A0m4, A0m5)) {
                            return true;
                        }
                        String A0m6 = C86114wI.A0m(sparseArray3, 6);
                        String A0m7 = C86114wI.A0m(A0B3, 6);
                        if (A0m7 == null) {
                            A0m7 = "";
                        }
                        if (!C121687Hl.A04(A0m6, A0m7)) {
                            return true;
                        }
                        if (contains) {
                            String A0m8 = C86114wI.A0m(sparseArray3, 30);
                            String A0m9 = C86114wI.A0m(A0B3, 30);
                            if (A0m9 == null) {
                                A0m9 = "";
                            }
                            if (!C121687Hl.A04(A0m8, A0m9)) {
                                return true;
                            }
                        }
                        if (contains2) {
                            String A0m10 = C86114wI.A0m(sparseArray3, 31);
                            String A0m11 = C86114wI.A0m(A0B3, 31);
                            if (A0m11 == null) {
                                A0m11 = "";
                            }
                            if (!C121687Hl.A04(A0m10, A0m11)) {
                                return true;
                            }
                        }
                        String A0m12 = C86114wI.A0m(sparseArray3, 7);
                        String A0m13 = C86114wI.A0m(A0B3, 7);
                        if (A0m13 == null) {
                            A0m13 = "";
                        }
                        if (!C121687Hl.A04(A0m12, A0m13)) {
                            return true;
                        }
                        String A0m14 = C86114wI.A0m(sparseArray3, 8);
                        String A0m15 = C86114wI.A0m(A0B3, 8);
                        if (A0m15 == null) {
                            A0m15 = "";
                        }
                        if (!C121687Hl.A04(A0m14, A0m15)) {
                            return true;
                        }
                        String A0m16 = C86114wI.A0m(sparseArray3, 9);
                        String A0m17 = C86114wI.A0m(A0B3, 9);
                        if (A0m17 == null) {
                            A0m17 = "";
                        }
                        if (!C121687Hl.A04(A0m16, A0m17)) {
                            return true;
                        }
                    } else if (!C121687Hl.A03(C86114wI.A0m(A0B3, 2)) || !C121687Hl.A03(C86114wI.A0m(A0B3, 5)) || !C121687Hl.A03(C86114wI.A0m(A0B3, 6))) {
                        return true;
                    } else {
                        if (contains && !C121687Hl.A03(C86114wI.A0m(A0B3, 30))) {
                            return true;
                        }
                        if ((contains2 && !C121687Hl.A03(C86114wI.A0m(A0B3, 31))) || !C121687Hl.A03(C86114wI.A0m(A0B3, 7)) || !C121687Hl.A03(C86114wI.A0m(A0B3, 8)) || !C121687Hl.A03(C86114wI.A0m(A0B3, 9))) {
                            return true;
                        }
                    }
                    if (iSO3Country3 == null) {
                        iSO3Country3 = "";
                    }
                    z2 = !C121687Hl.A04(iSO3Country2, iSO3Country3);
                } else {
                    continue;
                }
                if (!z) {
                    return true;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean A04() {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            C04220Ms.A0E("cellViewModels");
            throw null;
        }
        C1366783w it = immutableList.iterator();
        while (it.hasNext()) {
            if (!((AnonymousClass7Ih) it.next()).A0J()) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            C04220Ms.A0E("cellViewModels");
            throw null;
        }
        C1366783w it = immutableList.iterator();
        while (it.hasNext()) {
            if (!((AnonymousClass7Ih) it.next()).A0K()) {
                return false;
            }
        }
        return true;
    }

    public final void onCleared() {
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass7Ih) it.next()).A0G();
            }
        }
    }

    public final SparseArray A00() {
        SparseArray A0D = C86154wM.A0D();
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            int size = immutableList.size();
            int i = 0;
            while (i < size) {
                ImmutableList immutableList2 = this.A01;
                if (immutableList2 != null) {
                    SparseArray A0E = ((AnonymousClass7Ih) immutableList2.get(i)).A0E();
                    C04220Ms.A06(A0E);
                    int size2 = A0E.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        C86134wK.A1A(A0E, A0D, i2);
                    }
                    i++;
                }
            }
            return A0D;
        }
        C04220Ms.A0E("cellViewModels");
        throw null;
    }
}
