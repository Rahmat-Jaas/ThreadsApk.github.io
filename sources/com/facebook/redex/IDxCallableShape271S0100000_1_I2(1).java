package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0UD;
import X.AnonymousClass0hL;
import X.AnonymousClass0wJ;
import X.AnonymousClass344;
import X.AnonymousClass4DS;
import X.C04220Ms;
import X.C15430rJ;
import X.C18180wK;
import X.C18250wR;
import X.C22651Yx;
import X.C25553Dnn;
import X.C25918DvM;
import X.C31176Gi6;
import X.GO4;
import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.facebook.fblibraries.fblogin.InstagramSSOSessionInfo;
import com.instagram.barcelona.R;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.igds.components.tooltip.IDxTCallbackShape159S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class IDxCallableShape271S0100000_1_I2 implements Callable {
    public Object A00;
    public final int A01;

    public IDxCallableShape271S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String string;
        switch (this.A01) {
            case 0:
                Context context = (Context) this.A00;
                Uri A012 = C15430rJ.A01("content://com.instagram.contentprovider.FamilyAppsUserValuesProvider");
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Cursor cursor = null;
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    AnonymousClass0UD.A00("com.instagram.contentprovider.FamilyAppsUserValuesProvider", 236226351, AnonymousClass006.A00);
                    ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient("com.instagram.contentprovider.FamilyAppsUserValuesProvider");
                    if (acquireUnstableContentProviderClient != null) {
                        cursor = acquireUnstableContentProviderClient.query(A012, (String[]) null, "all_session_info", (String[]) null, (String) null);
                        if (cursor == null) {
                            cursor = acquireUnstableContentProviderClient.query(A012, (String[]) null, (String) null, (String[]) null, (String) null);
                        }
                        while (cursor != null && cursor.moveToNext()) {
                            int columnIndex = cursor.getColumnIndex("COL_USERNAME");
                            int columnIndex2 = cursor.getColumnIndex("COL_FULL_NAME");
                            int columnIndex3 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
                            int columnIndex4 = cursor.getColumnIndex("COL_SESSION_ID");
                            int columnIndex5 = cursor.getColumnIndex("COL_IS_BUSINESS");
                            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1)) {
                                boolean z = false;
                                if (!(columnIndex5 == -1 || (string = cursor.getString(columnIndex5)) == null)) {
                                    z = Boolean.parseBoolean(string);
                                }
                                A0v.add(new InstagramSSOSessionInfo(cursor.getString(columnIndex2), cursor.getString(columnIndex), cursor.getString(columnIndex4), cursor.getString(columnIndex3), z));
                            }
                        }
                    }
                } catch (SecurityException | UnsupportedOperationException e) {
                    AnonymousClass0LU.A0G("LoginSSOUtil", "Exception while getting Instagram content provider: ", e);
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                        throw th;
                    }
                }
                if (cursor == null) {
                    return A0v;
                }
                cursor.close();
                return A0v;
            case 1:
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A00;
                AnonymousClass344 r6 = followersShareFragment.A0J;
                r6.getClass();
                UserSession userSession = followersShareFragment.A0T;
                View view = followersShareFragment.mAdvancedSettingRow;
                view.getClass();
                View A0E = C18180wK.A0E(view, R.id.advanced_settings_text_view);
                C04220Ms.A0B(userSession, 0);
                C25918DvM dvM = r6.A00;
                if (dvM == null) {
                    Context context2 = A0E.getContext();
                    C04220Ms.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
                    C25553Dnn A002 = AnonymousClass4DS.A00((Activity) context2, 2131824744);
                    A002.A0D = true;
                    C18250wR.A0r(A0E, A002);
                    A002.A0A = true;
                    A002.A0B = true;
                    A002.A05 = new IDxTCallbackShape159S0100000_1_I2(userSession, 6);
                    dvM = A002.A00();
                    r6.A00 = dvM;
                }
                if (dvM != null) {
                    dvM.A05();
                    return true;
                }
                throw AnonymousClass0wJ.A0b();
            default:
                C22651Yx r62 = (C22651Yx) this.A00;
                Bitmap bitmap = r62.A00;
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    File A05 = AnonymousClass0hL.A05(r62.getContext());
                    Bitmap bitmap2 = r62.A00;
                    if (bitmap2 != null) {
                        C31176Gi6.A0J(bitmap2, A05);
                        r62.A01 = Uri.fromFile(A05);
                        String A08 = AnonymousClass00U.A08(System.currentTimeMillis(), "");
                        String canonicalPath = A05.getCanonicalPath();
                        C04220Ms.A06(canonicalPath);
                        GO4.A00(AnonymousClass0wJ.A0X(r62.A0N), A08, canonicalPath, width);
                        return A08;
                    }
                }
                C04220Ms.A0E("birthdaySelfieBitmap");
                th = null;
                break;
        }
        throw th;
    }
}
