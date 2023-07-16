package X;

import android.util.SparseArray;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5hU  reason: invalid class name and case insensitive filesystem */
public final class C92035hU extends C92055hW {
    public TextFieldHandler A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AddressCellParams A04;
    public final AnonymousClass67I A05;
    public final AnonymousClass69W A06;
    public final ImmutableList A07;
    public final Map A08;
    public final Set A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92035hU(AddressCellParams addressCellParams, AnonymousClass67I r12, AnonymousClass69W r13, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(i, z, z2);
        String str8 = str;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        HashSet A0u = C18200wM.A0u();
        this.A09 = A0u;
        String str14 = str2;
        this.A0E = AnonymousClass0wJ.A1W(str14);
        this.A06 = r13;
        SparseArray sparseArray = this.A04;
        if (str2 != null) {
            str8 = AnonymousClass00U.A0L("••• ", str14);
        } else if (str == null) {
            str8 = "";
        }
        sparseArray.put(13, str8);
        sparseArray.put(14, str3 == null ? "" : str9);
        sparseArray.put(2, str5 == null ? "" : str11);
        sparseArray.put(15, str4 == null ? "" : str10);
        sparseArray.put(20, str6 == null ? "" : str12);
        sparseArray.put(21, str7 == null ? "" : str13);
        if (immutableList2 != null && !immutableList2.isEmpty()) {
            A0u.addAll(immutableList2);
        }
        this.A05.A0H(sparseArray.clone());
        this.A07 = immutableList;
        this.A0F = z3;
        this.A0D = z4;
        this.A0G = z5;
        this.A08 = map;
        this.A01 = i2;
        this.A05 = r12;
        this.A0B = z6;
        this.A03 = i3;
        this.A02 = i4;
        this.A04 = addressCellParams;
        this.A0A = z7;
        this.A0C = z8;
        A0N();
    }
}
