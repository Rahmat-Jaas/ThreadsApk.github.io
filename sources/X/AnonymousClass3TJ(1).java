package X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.3TJ  reason: invalid class name */
public final class AnonymousClass3TJ {
    public Boolean A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final boolean A07;

    public AnonymousClass3TJ(Boolean bool, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = str;
        this.A07 = z;
        this.A02 = z2;
        this.A00 = bool;
        this.A04 = z3;
        this.A05 = z4;
        this.A01 = str2;
        this.A03 = z5;
    }

    public static AnonymousClass3TJ A00(Context context) {
        boolean z;
        Cursor A002 = C13960oa.A00(context.getContentResolver(), C18220wO.A0G(context.getPackageName()), (String) null, (String) null, (String[]) null, (String[]) null, 219232652);
        if (A002 != null) {
            try {
                if (A002.moveToFirst()) {
                    int columnIndex = A002.getColumnIndex("package_name");
                    int columnIndex2 = A002.getColumnIndex("signature");
                    int columnIndex3 = A002.getColumnIndex("is_managed");
                    int columnIndex4 = A002.getColumnIndex("auto_updates");
                    int columnIndex5 = A002.getColumnIndex("has_mobile_data_consent");
                    int columnIndex6 = A002.getColumnIndex("notif_update_available");
                    int columnIndex7 = A002.getColumnIndex("notif_update_installed");
                    int columnIndex8 = A002.getColumnIndex("rollout_token");
                    int columnIndex9 = A002.getColumnIndex("terms_of_service_accepted");
                    int columnIndex10 = A002.getColumnIndex("show_accept_tos");
                    int columnIndex11 = A002.getColumnIndex("show_show_explicit_tos");
                    String string = A002.getString(columnIndex);
                    A002.getString(columnIndex2);
                    int i = A002.getInt(columnIndex3);
                    boolean z2 = true;
                    boolean A1V = C18180wK.A1V(i);
                    boolean A1V2 = C18180wK.A1V(A002.getInt(columnIndex4));
                    boolean A1V3 = C18180wK.A1V(A002.getInt(columnIndex6));
                    boolean A1V4 = C18180wK.A1V(A002.getInt(columnIndex7));
                    String string2 = A002.getString(columnIndex8);
                    if (columnIndex9 >= 0) {
                        z = C18180wK.A1V(A002.getInt(columnIndex9));
                    } else {
                        z = false;
                    }
                    if (columnIndex10 >= 0) {
                        A002.getInt(columnIndex10);
                        A002.getInt(columnIndex11);
                    }
                    Boolean bool = null;
                    if (columnIndex5 >= 0) {
                        if (A002.getInt(columnIndex5) == 0) {
                            z2 = false;
                        }
                        bool = Boolean.valueOf(z2);
                    }
                    return new AnonymousClass3TJ(bool, string, string2, A1V, A1V2, A1V3, A1V4, z);
                }
                throw C18180wK.A0a("Failed to fetch settings: empty cursor");
            } finally {
                A002.close();
            }
        } else {
            throw C18180wK.A0a("Failed to fetch settings: null cursor.");
        }
    }
}
