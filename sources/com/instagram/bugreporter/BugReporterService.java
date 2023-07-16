package com.instagram.bugreporter;

import X.AnonymousClass000;
import X.AnonymousClass0Jc;
import X.AnonymousClass0wJ;
import X.AnonymousClass2SO;
import X.AnonymousClass3LZ;
import X.AnonymousClass3QB;
import X.AnonymousClass3UP;
import X.AnonymousClass3WI;
import X.AnonymousClass3WS;
import X.AnonymousClass7EV;
import X.AnonymousClass7Ko;
import X.C011805m;
import X.C03690Kh;
import X.C04620Ok;
import X.C06810aP;
import X.C10370iE;
import X.C10380iF;
import X.C10450iM;
import X.C11630kW;
import X.C121907Is;
import X.C13330nS;
import X.C16230sh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C22211Tu;
import X.C24211hf;
import X.C25614Dop;
import X.C28161tl;
import X.C28174Ezk;
import X.C30949Gbq;
import X.C31155GhB;
import X.C32165H8c;
import X.C548430h;
import X.C570639p;
import X.C61053Rs;
import X.C61593Uj;
import X.C62033Ww;
import X.C63473hX;
import X.C63853iS;
import X.C685044b;
import X.H1R;
import X.H1T;
import X.H3U;
import X.Lv4;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.JsonWriter;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class BugReporterService extends C011805m {
    public static void A04(Context context, UserSession userSession) {
        Context context2 = context;
        String A04 = C121907Is.A04(context);
        String A0l = AnonymousClass0wJ.A0l(context2, A04, 2131822735);
        String string = context2.getString(2131822733);
        int i = R.drawable.notification_icon;
        int A02 = C121907Is.A02(context2, R.attr.defaultNotificationIcon);
        if (A02 != 0) {
            i = A02;
        }
        A01((PendingIntent) null, context2, C18230wP.A0B(), userSession, A0l, string, AnonymousClass0wJ.A0l(context2, A04, 2131822735), i, 3, true);
    }

    public static void A05(UserSession userSession, String str, boolean z) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, userSession), "ig_flytrap_upload"), 1241);
        A0I.A0Q("success", C18180wK.A0X());
        A0I.A0T("error", str);
        A0I.A0Q("complete_logs_enabled", C18210wN.A0R(A0I, C18180wK.A0Y(), "production_build", z));
        A0I.Bb4();
        C61593Uj.A04.A00(userSession).A00(str);
    }

    public static void A06(UserSession userSession, String str, boolean z) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, userSession), "ig_flytrap_upload"), 1241);
        Boolean A0Y = C18180wK.A0Y();
        A0I.A0Q("success", A0Y);
        A0I.A0S("bug_id", AnonymousClass0wJ.A0d(str));
        A0I.A0Q("complete_logs_enabled", C18210wN.A0R(A0I, A0Y, "production_build", z));
        A0I.Bb4();
        C61593Uj A00 = C61593Uj.A04.A00(userSession);
        long j = A00.A00;
        if (j != 0) {
            A00.A01.flowEndSuccess(j);
            A00.A00 = 0;
        }
    }

    public static void A01(PendingIntent pendingIntent, Context context, Intent intent, UserSession userSession, String str, String str2, String str3, int i, int i2, boolean z) {
        String A03 = C63853iS.A03(context, userSession, "support_ticket");
        C16230sh r4 = new C16230sh();
        if (z) {
            r4.A0D = true;
        } else {
            r4.A06(intent, context.getClassLoader());
        }
        PendingIntent A01 = r4.A01(context, (int) System.currentTimeMillis(), 268435456);
        C30949Gbq gbq = new C30949Gbq(context, A03);
        gbq.A08(str);
        gbq.A07(str2);
        gbq.A05(i);
        gbq.A0A(true);
        gbq.A09(str3);
        long currentTimeMillis = System.currentTimeMillis();
        Notification notification = gbq.A09;
        notification.when = currentTimeMillis;
        gbq.A0A = A01;
        if (pendingIntent != null) {
            notification.deleteIntent = pendingIntent;
        }
        new AnonymousClass7EV(context).A01((String) null, i2, gbq.A01());
    }

    public static void A02(Context context, BugReport bugReport, BugReportComposerViewModel bugReportComposerViewModel, UserSession userSession, boolean z) {
        Context context2 = context;
        Intent A04 = C18250wR.A04(context, BugReporterActivity.class);
        UserSession userSession2 = userSession;
        A04.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A04.setFlags(268435456);
        A04.putExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT", bugReport);
        A04.putExtra("BugReporterActivity.INTENT_EXTRA_VIEWMODEL", bugReportComposerViewModel);
        A04.putExtra("BugReporterActivity.INTENT_UPLOAD_FAILED", true);
        String A042 = C121907Is.A04(context);
        Intent A043 = C18250wR.A04(context, BugReportUploadFailedNotificationDismissedReceiver.class);
        A043.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A043.putExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT", bugReport);
        PendingIntent A02 = C18210wN.A0I(context, A043).A02(context, 0, 0);
        String A0h = C18220wO.A0h(context, A042, bugReport.A05, 2131822714);
        int i = 2131822712;
        if (z) {
            i = 2131822711;
        }
        String string = context.getString(i);
        String A0l = AnonymousClass0wJ.A0l(context2, A042, 2131822713);
        if (!z) {
            A04 = C18230wP.A0B();
        }
        A01(A02, context2, A04, userSession2, A0h, string, A0l, 17301642, 2, !z);
    }

    public static void A03(Context context, BugReport bugReport, UserSession userSession, String str, String str2) {
        String str3;
        String str4;
        String str5 = str2;
        if (!TextUtils.isEmpty(str5) && new File(str5).exists()) {
            UserSession userSession2 = userSession;
            String A06 = C28161tl.A06(AnonymousClass3WS.A01(userSession2), "fbns_token", "");
            String userId = userSession2.getUserId();
            HashMap A0y = AnonymousClass0wJ.A0y();
            BugReport bugReport2 = bugReport;
            HashMap hashMap = bugReport2.A0C;
            for (Object next : hashMap.keySet()) {
                A0y.put(next, hashMap.get(next));
            }
            String str6 = bugReport2.A06;
            if (str6 != null && !str6.equals("")) {
                A0y.put("latest_reel_loading_error", str6);
            }
            C570639p A00 = AnonymousClass3UP.A01.A00();
            if (A00 != null) {
                A0y.put(A00.A01, new JSONObject(A00.A02).toString());
            }
            A0y.put("fbns_token", A06);
            String A0g = C18200wM.A0g();
            C04620Ok r0 = C06810aP.A01;
            String A0k = C18200wM.A0k(userSession2, r0);
            String str7 = bugReport2.A03;
            if (str7 == null) {
                str7 = "493186350727442";
            }
            boolean A1X = C18200wM.A1X(userSession2, r0);
            String str8 = bugReport2.A04;
            if (str8 == null) {
                str8 = "161101191344941";
            }
            String str9 = bugReport2.A01;
            String str10 = bugReport2.A05;
            String obj = bugReport2.A00.toString();
            String str11 = C685044b.A00(userSession2).A00;
            String str12 = bugReport2.A08;
            H1T A0O = AnonymousClass0wJ.A0O(userSession2);
            H1R h1r = A0O.A04;
            AnonymousClass7Ko.A0B(C62033Ww.A00("graphql.instagram.com"));
            h1r.A0A = "graphql.instagram.com";
            A0O.A0J("/bug_report_file_upload/");
            A0O.A0B(C22211Tu.class, AnonymousClass3LZ.class);
            A0O.A0O("user_identifier", userId);
            A0O.A0O(OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME, Long.toString(C18190wL.A07()));
            A0O.A0O("config_id", str8);
            A0O.A0O("locale", Lv4.A01(Locale.getDefault()));
            if (A1X) {
                str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str3 = "0";
            }
            A0O.A0O("is_business", str3);
            if (obj != null) {
                A0O.A0O("source", obj);
            }
            if (str12 != null) {
                A0O.A0O("endpoint", str12);
            }
            if (str11 != null) {
                A0O.A0O("claim", str11);
            }
            try {
                StringWriter A0d = C18230wP.A0d();
                Context context2 = context;
                JsonWriter A002 = C61053Rs.A00(AnonymousClass0wJ.A0G(context2, new JsonWriter(A0d).beginObject().name(AnonymousClass3QB.A00(0, 9, 122)).value(A0g), userId, str9, A0k), Build.VERSION.RELEASE, obj, false);
                if (str12 != null) {
                    A002.name("endpoint").value(str12);
                }
                Iterator A0x = C18220wO.A0x(A0y);
                while (A0x.hasNext()) {
                    String A0k2 = C18180wK.A0k(A0x);
                    A002.name(A0k2).value(C18220wO.A0r(A0k2, A0y));
                }
                A002.endObject().close();
                StringWriter A0d2 = C18230wP.A0d();
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
                JsonWriter name = new JsonWriter(A0d2).beginObject().name(DevServerEntity.COLUMN_DESCRIPTION).value(str10).name("category_id").value(str7).name("misc_info").value(A0d.toString()).name(TraceFieldType.NetworkType);
                String str13 = "null";
                if (activeNetworkInfo == null) {
                    str4 = str13;
                } else {
                    str4 = activeNetworkInfo.getTypeName();
                }
                JsonWriter name2 = name.value(str4).name(AnonymousClass000.A00(183));
                if (activeNetworkInfo != null) {
                    str13 = activeNetworkInfo.getSubtypeName();
                }
                name2.value(str13).endObject().close();
                A0O.A0O("metadata", A0d2.toString());
            } catch (IOException unused) {
            }
            File file = new File(str5);
            if (file.exists()) {
                String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str5);
                if (contentTypeFor != null) {
                    h1r.A0Q.A00.put("file", new H3U(file, contentTypeFor));
                } else {
                    A0O.A0A(file);
                }
            }
            C32165H8c A0T = C18200wM.A0T(A0O, "bug_id", str);
            A0T.A00 = new C24211hf(str5);
            C31155GhB.A02(A0T);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.3iU] */
    /* JADX WARNING: type inference failed for: r26v2, types: [com.instagram.common.api.base.IDxACallbackShape0S0500000_1_I2] */
    /* JADX WARNING: type inference failed for: r10v14, types: [com.instagram.common.api.base.IDxACallbackShape1S0600000_1_I2] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0220, code lost:
        if (r2.isEmpty() != false) goto L_0x0222;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleWork(android.content.Intent r34) {
        /*
            r33 = this;
            r31 = r33
            android.content.Context r8 = r31.getApplicationContext()
            java.lang.String r0 = "BugReporterActivity.INTENT_EXTRA_BUGREPORT"
            r1 = r34
            android.os.Parcelable r7 = r1.getParcelableExtra(r0)
            com.instagram.bugreporter.BugReport r7 = (com.instagram.bugreporter.BugReport) r7
            java.lang.String r0 = "BugReporterActivity.INTENT_EXTRA_VIEWMODEL"
            android.os.Parcelable r6 = r1.getParcelableExtra(r0)
            com.instagram.bugreporter.BugReportComposerViewModel r6 = (com.instagram.bugreporter.BugReportComposerViewModel) r6
            android.os.Bundle r0 = r1.getExtras()
            java.lang.String r2 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r1 = r0.getString(r2)
            android.os.Bundle r0 = X.C18180wK.A06()
            r0.putString(r2, r1)
            com.instagram.service.session.UserSession r5 = X.C18180wK.A0V(r0)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36315194028198356(0x81047a000009d4, double:3.029213160757236E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 != 0) goto L_0x004b
            boolean r0 = X.C09650fs.A02(r8)
            if (r0 == 0) goto L_0x00de
            r0 = 2342170018696931156(0x20810f3900002754, double:4.071529327424754E-152)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x00de
        L_0x004b:
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = new com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000
            r3.<init>()
            java.lang.String r0 = r7.A05
            java.lang.String r4 = r7.A02
            r2 = r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x005a
            r2 = r1
        L_0x005a:
            r0 = 10
            if (r4 != 0) goto L_0x005f
            r4 = r1
        L_0x005f:
            java.lang.String r1 = X.AnonymousClass00U.A0N(r2, r4, r0)
            java.lang.String r0 = "description"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.String r1 = r7.A03
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = "493186350727442"
        L_0x006e:
            java.lang.String r0 = "category_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            X.25S r0 = r7.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "source"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            X.44b r0 = X.C685044b.A00(r5)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "claim"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "endpoint"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.String r1 = r7.A07
            java.lang.String r0 = "nav_chain"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            boolean r2 = r6.A04
            java.lang.String r1 = A00(r8, r7, r5, r2)
            java.lang.String r0 = "misc_info"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "has_complete_logs_consent"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r3, r1, r0)
            r1 = 0
            java.lang.String r0 = "files"
            r3.A0A(r0, r1)
            X.3zb r2 = X.C67463zb.A00()
            X.C67463zb.A01(r3, r2)
            r27 = 1
            X.AnonymousClass7Ko.A0B(r27)
            java.lang.Class<X.15f> r1 = X.C205615f.class
            java.lang.String r0 = "IGBugReportSubmitMutation"
            X.3zc r0 = X.C67473zc.A00(r2, r1, r0)
            X.H8c r1 = X.C18200wM.A0S(r0, r5)
            com.instagram.common.api.base.IDxACallbackShape0S0500000_1_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape0S0500000_1_I2
            r26 = r0
            r28 = r8
            r29 = r7
            r30 = r6
            r32 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32)
        L_0x00d8:
            r1.A00 = r0
            X.C31155GhB.A02(r1)
            return
        L_0x00de:
            X.1tl r1 = X.AnonymousClass3WS.A01(r5)
            java.lang.String r10 = "fbns_token"
            java.lang.String r0 = ""
            java.lang.String r4 = X.C28161tl.A06(r1, r10, r0)
            java.lang.String r30 = r5.getUserId()
            java.util.HashMap r3 = r7.A0C
            boolean r11 = r6.A04
            if (r11 != 0) goto L_0x013a
            java.lang.String r1 = "black_box_trace_id"
            r3.remove(r1)
            java.lang.String r1 = "dogfooding_assistant_tag"
            r3.remove(r1)
            java.lang.String r1 = "dogfooding_assistant_owner"
            r3.remove(r1)
            java.lang.String r2 = "has_complete_logs_consent"
            java.lang.String r1 = "0"
            r3.put(r2, r1)
            X.3IL r1 = new X.3IL
            r1.<init>()
            r1.A02(r7)
            com.instagram.bugreporter.BugReport r9 = r1.A00()
        L_0x0116:
            r29 = 0
            r22 = 0
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r13 = r9.A0C
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r3 = r1.iterator()
        L_0x0128:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x013c
            java.lang.Object r2 = r3.next()
            java.lang.Object r1 = r13.get(r2)
            r12.put(r2, r1)
            goto L_0x0128
        L_0x013a:
            r9 = r7
            goto L_0x0116
        L_0x013c:
            java.lang.String r2 = r9.A06
            if (r2 == 0) goto L_0x014b
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L_0x014b
            java.lang.String r1 = "latest_reel_loading_error"
            r12.put(r1, r2)
        L_0x014b:
            if (r11 == 0) goto L_0x0165
            X.3UP r1 = X.AnonymousClass3UP.A01
            X.39p r1 = r1.A00()
            if (r1 == 0) goto L_0x0165
            java.lang.String r3 = r1.A01
            java.util.Map r2 = r1.A02
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
            java.lang.String r1 = r1.toString()
            r12.put(r3, r1)
        L_0x0165:
            r12.put(r10, r4)
            java.lang.String r28 = X.C18200wM.A0g()
            X.0Ok r1 = X.C06810aP.A01
            java.lang.String r27 = X.C18200wM.A0k(r5, r1)
            java.lang.String r10 = r9.A03
            if (r10 != 0) goto L_0x0178
            java.lang.String r10 = "493186350727442"
        L_0x0178:
            boolean r17 = X.C18200wM.A1X(r5, r1)
            boolean r26 = X.C25614Dop.A01(r8)
            java.lang.String r14 = r9.A04
            if (r14 != 0) goto L_0x0186
            java.lang.String r14 = "161101191344941"
        L_0x0186:
            java.util.ArrayList r1 = r9.A0B
            r25 = r1
            java.util.ArrayList r1 = r9.A0A
            r24 = r1
            X.25S r1 = r9.A00
            java.lang.String r4 = r1.toString()
            X.44b r1 = X.C685044b.A00(r5)
            java.lang.String r13 = r1.A00
            java.lang.String r3 = r9.A08
            java.lang.String r1 = r9.A07
            r23 = r1
            java.lang.String r2 = A00(r8, r7, r5, r11)
            java.lang.String r1 = r9.A01
            if (r1 == 0) goto L_0x01aa
            r29 = r1
        L_0x01aa:
            java.lang.String r15 = r9.A05
            java.lang.String r1 = r9.A02
            if (r15 != 0) goto L_0x01b2
            if (r1 == 0) goto L_0x01c0
        L_0x01b2:
            if (r15 != 0) goto L_0x01b5
            r15 = r0
        L_0x01b5:
            r16 = 10
            if (r1 != 0) goto L_0x01ba
            r1 = r0
        L_0x01ba:
            r0 = r16
            java.lang.String r22 = X.AnonymousClass00U.A0N(r15, r1, r0)
        L_0x01c0:
            r0 = 91
            java.lang.String r21 = X.AnonymousClass000.A00(r0)
            r0 = 78
            java.lang.String r20 = X.C28174Ezk.A00(r0)
            X.GWw r1 = new X.GWw
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.A01 = r0
            java.lang.Class<X.3La> r0 = X.C59493La.class
            r1.A03(r0)
            java.lang.String r15 = "user_identifier"
            r0 = r30
            r1.A04(r15, r0)
            long r15 = X.C18190wL.A07()
            java.lang.String r15 = java.lang.Long.toString(r15)
            java.lang.String r0 = "client_time"
            r1.A04(r0, r15)
            java.lang.String r0 = "config_id"
            r1.A04(r0, r14)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r14 = X.Lv4.A01(r0)
            java.lang.String r0 = "locale"
            r1.A04(r0, r14)
            java.lang.String r19 = "1"
            java.lang.String r18 = "0"
            r14 = r18
            if (r17 == 0) goto L_0x020a
            r14 = r19
        L_0x020a:
            java.lang.String r0 = "is_business"
            r1.A04(r0, r14)
            if (r13 == 0) goto L_0x0216
            java.lang.String r0 = "claim"
            r1.A04(r0, r13)
        L_0x0216:
            java.lang.String r13 = "endpoint"
            java.lang.String r17 = "source"
            if (r2 == 0) goto L_0x0222
            boolean r0 = r2.isEmpty()     // Catch:{ IOException -> 0x032d }
            if (r0 == 0) goto L_0x0284
        L_0x0222:
            java.io.StringWriter r16 = X.C18230wP.A0d()     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ IOException -> 0x032d }
            r0 = r16
            r2.<init>(r0)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r14 = r2.beginObject()     // Catch:{ IOException -> 0x032d }
            r15 = 0
            r2 = 9
            r0 = 122(0x7a, float:1.71E-43)
            java.lang.String r0 = X.AnonymousClass3QB.A00(r15, r2, r0)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r2 = r14.name(r0)     // Catch:{ IOException -> 0x032d }
            r0 = r28
            android.util.JsonWriter r15 = r2.value(r0)     // Catch:{ IOException -> 0x032d }
            r14 = r29
            r2 = r27
            r0 = r30
            android.util.JsonWriter r14 = X.AnonymousClass0wJ.A0G(r8, r15, r0, r14, r2)     // Catch:{ IOException -> 0x032d }
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException -> 0x032d }
            r0 = r26
            android.util.JsonWriter r14 = X.C61053Rs.A00(r14, r2, r4, r0)     // Catch:{ IOException -> 0x032d }
            if (r3 == 0) goto L_0x025f
            android.util.JsonWriter r0 = r14.name(r13)     // Catch:{ IOException -> 0x032d }
            r0.value(r3)     // Catch:{ IOException -> 0x032d }
        L_0x025f:
            java.util.Iterator r15 = X.C18220wO.A0x(r12)     // Catch:{ IOException -> 0x032d }
        L_0x0263:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x032d }
            if (r0 == 0) goto L_0x0279
            java.lang.String r0 = X.C18180wK.A0k(r15)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r2 = r14.name(r0)     // Catch:{ IOException -> 0x032d }
            java.lang.String r0 = X.C18220wO.A0r(r0, r12)     // Catch:{ IOException -> 0x032d }
            r2.value(r0)     // Catch:{ IOException -> 0x032d }
            goto L_0x0263
        L_0x0279:
            android.util.JsonWriter r0 = r14.endObject()     // Catch:{ IOException -> 0x032d }
            r0.close()     // Catch:{ IOException -> 0x032d }
            java.lang.String r2 = r16.toString()     // Catch:{ IOException -> 0x032d }
        L_0x0284:
            java.io.StringWriter r12 = X.C18230wP.A0d()     // Catch:{ IOException -> 0x032d }
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r8.getSystemService(r0)     // Catch:{ IOException -> 0x032d }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ IOException -> 0x032d }
            android.net.NetworkInfo r15 = r0.getActiveNetworkInfo()     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r0 = new android.util.JsonWriter     // Catch:{ IOException -> 0x032d }
            r0.<init>(r12)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r14 = r0.beginObject()     // Catch:{ IOException -> 0x032d }
            java.lang.String r0 = "description"
            android.util.JsonWriter r14 = r14.name(r0)     // Catch:{ IOException -> 0x032d }
            r0 = r22
            android.util.JsonWriter r14 = r14.value(r0)     // Catch:{ IOException -> 0x032d }
            java.lang.String r0 = "category_id"
            android.util.JsonWriter r0 = r14.name(r0)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r10 = r0.value(r10)     // Catch:{ IOException -> 0x032d }
            java.lang.String r0 = "has_complete_logs_consent"
            android.util.JsonWriter r10 = r10.name(r0)     // Catch:{ IOException -> 0x032d }
            if (r11 != 0) goto L_0x02bd
            r19 = r18
        L_0x02bd:
            r0 = r19
            android.util.JsonWriter r10 = r10.value(r0)     // Catch:{ IOException -> 0x032d }
            java.lang.String r0 = "misc_info"
            android.util.JsonWriter r0 = r10.name(r0)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r2 = r0.value(r2)     // Catch:{ IOException -> 0x032d }
            java.lang.String r0 = "network_type"
            android.util.JsonWriter r2 = r2.name(r0)     // Catch:{ IOException -> 0x032d }
            java.lang.String r10 = "null"
            if (r15 != 0) goto L_0x02d9
            r0 = r10
            goto L_0x02dd
        L_0x02d9:
            java.lang.String r0 = r15.getTypeName()     // Catch:{ IOException -> 0x032d }
        L_0x02dd:
            android.util.JsonWriter r2 = r2.value(r0)     // Catch:{ IOException -> 0x032d }
            r0 = 183(0xb7, float:2.56E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r2 = r2.name(r0)     // Catch:{ IOException -> 0x032d }
            if (r15 != 0) goto L_0x02ef
            r0 = r10
            goto L_0x02f3
        L_0x02ef:
            java.lang.String r0 = r15.getSubtypeName()     // Catch:{ IOException -> 0x032d }
        L_0x02f3:
            android.util.JsonWriter r2 = r2.value(r0)     // Catch:{ IOException -> 0x032d }
            r0 = r17
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ IOException -> 0x032d }
            if (r4 != 0) goto L_0x0300
            r4 = r10
        L_0x0300:
            android.util.JsonWriter r0 = r0.value(r4)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r0 = r0.name(r13)     // Catch:{ IOException -> 0x032d }
            if (r3 != 0) goto L_0x030b
            r3 = r10
        L_0x030b:
            android.util.JsonWriter r2 = r0.value(r3)     // Catch:{ IOException -> 0x032d }
            java.lang.String r0 = "nav_chain"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ IOException -> 0x032d }
            if (r23 == 0) goto L_0x0319
            r10 = r23
        L_0x0319:
            android.util.JsonWriter r0 = r0.value(r10)     // Catch:{ IOException -> 0x032d }
            android.util.JsonWriter r0 = r0.endObject()     // Catch:{ IOException -> 0x032d }
            r0.close()     // Catch:{ IOException -> 0x032d }
            java.lang.String r2 = "metadata"
            java.lang.String r0 = r12.toString()     // Catch:{ IOException -> 0x032d }
            r1.A04(r2, r0)     // Catch:{ IOException -> 0x032d }
        L_0x032d:
            r4 = 0
            if (r25 == 0) goto L_0x036a
            r10 = 0
        L_0x0331:
            int r0 = r25.size()
            if (r10 >= r0) goto L_0x036a
            r0 = r25
            java.lang.String r2 = X.C18190wL.A0p(r0, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0367
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0367
            java.net.FileNameMap r0 = java.net.URLConnection.getFileNameMap()
            java.lang.String r2 = r0.getContentTypeFor(r2)
            if (r2 != 0) goto L_0x035e
            r0 = 447(0x1bf, float:6.26E-43)
            java.lang.String r2 = X.C28174Ezk.A00(r0)
        L_0x035e:
            java.lang.String r0 = "screenshot"
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r10)
            r1.A02(r3, r0, r2)
        L_0x0367:
            int r10 = r10 + 1
            goto L_0x0331
        L_0x036a:
            if (r24 == 0) goto L_0x0397
        L_0x036c:
            int r0 = r24.size()
            if (r4 >= r0) goto L_0x0397
            r0 = r24
            java.lang.String r2 = X.C18190wL.A0p(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0394
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0394
            java.lang.String r0 = "attachment"
            java.lang.String r2 = X.AnonymousClass00U.A0J(r0, r4)
            java.lang.String r0 = "text/plain"
            r1.A02(r3, r2, r0)
        L_0x0394:
            int r4 = r4 + 1
            goto L_0x036c
        L_0x0397:
            r2 = r21
            r0 = r20
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "%s|%s"
            r3 = 0
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            r1.A02 = r0
            java.lang.Object[] r2 = new java.lang.Object[]{r21}
            java.lang.String r0 = "%s/bugs"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            r1.A03 = r0
            X.H8c r1 = r1.A01()
            com.instagram.common.api.base.IDxACallbackShape1S0600000_1_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape1S0600000_1_I2
            r10 = r0
            r11 = r8
            r12 = r7
            r13 = r9
            r14 = r6
            r15 = r31
            r16 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bugreporter.BugReporterService.onHandleWork(android.content.Intent):void");
    }

    public static String A00(Context context, BugReport bugReport, UserSession userSession, boolean z) {
        String str;
        String str2;
        try {
            JSONObject A0y = C18230wP.A0y();
            A0y.put(AnonymousClass3QB.A00(0, 9, 122), C18200wM.A0g());
            A0y.put("IG_UserId", userSession.getUserId());
            A0y.put("last_seen_ad_id", bugReport.A01);
            A0y.put("IG_Username", AnonymousClass0wJ.A0Y(userSession).BK7());
            A0y.put("Git_Hash", AnonymousClass0Jc.A00(context).A01);
            A0y.put("Build_Num", C10380iF.A00());
            A0y.put("Branch", C10380iF.A01(context));
            A0y.put("OS_Version", Build.VERSION.RELEASE);
            A0y.put("Manufacturer", Build.MANUFACTURER);
            A0y.put("Model", Build.MODEL);
            A0y.put("Locale", Locale.getDefault().getDisplayName(Locale.US));
            A0y.put("Build_Type", C10370iE.A00().toString());
            A0y.put("source", bugReport.A00.toString());
            A0y.put("last_played_video_ids", C548430h.A00.A00.toString());
            A0y.put("ar_engine_supported", String.valueOf(C25614Dop.A01(context)));
            A0y.put("available_disk_space_bytes", String.valueOf(C03690Kh.A01().A05()));
            A0y.put("fbns_token", C28161tl.A06(AnonymousClass3WS.A01(userSession), "fbns_token", ""));
            String A00 = AnonymousClass000.A00(1161);
            if (AnonymousClass3WI.A00(userSession).A00()) {
                str = C28174Ezk.A00(588);
            } else {
                str = "ig_django";
            }
            A0y.put(A00, str);
            switch (C63473hX.A00(userSession)) {
                case 0:
                    str2 = "DIRECT_INTEROP_GATING_STATUS_NOT_ELIGIBLE";
                    break;
                case 1:
                    str2 = "DIRECT_INTEROP_GATING_STATUS_ELIGIBLE_BUT_NOT_UPGRADED";
                    break;
                case 2:
                    str2 = "DIRECT_INTEROP_GATING_STATUS_ELIGIBLE_AND_UPGRADED";
                    break;
                default:
                    str2 = "DIRECT_INTEROP_GATING_STATUS_UNSET";
                    break;
            }
            A0y.put("user_interop_status", str2);
            A0y.put("direct_last_viewed_thread_is_interop", String.valueOf(AnonymousClass2SO.A00(userSession).A00.getBoolean("direct_last_viewed_thread_is_interop", false)));
            if (z) {
                String str3 = bugReport.A06;
                if (!TextUtils.isEmpty(str3)) {
                    A0y.put("latest_reel_loading_error", str3);
                }
                C570639p A002 = AnonymousClass3UP.A01.A00();
                if (A002 != null) {
                    A0y.put(A002.A01, new JSONObject(A002.A02).toString());
                }
            }
            Iterator A0u = C18190wL.A0u(bugReport.A0C);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                A0y.put(C18200wM.A0p(A0o), A0o.getValue());
            }
            return A0y.toString();
        } catch (JSONException e) {
            C10450iM.A04("BugReporterService", C18230wP.A0t("Error constructing misc_info for Flytrap bug", e), 1);
            return "";
        }
    }
}
