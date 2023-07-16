package X;

import android.content.Context;
import com.facebook.redex.IDxAObserverShape4S2200000_2_I2;
import com.facebook.redex.IDxFCallbackShape314S0100000_2_I2;
import com.facebook.redex.IDxSCallbackShape852S0100000_2_I2;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.7BP  reason: invalid class name */
public final class AnonymousClass7BP {
    public static void A02(Context context, C145358kN r18, Boolean bool, String str, String str2, String str3, String str4, List list, List list2, Map map) {
        String str5;
        Map map2 = map;
        if (map2.get("target_account_id") != null) {
            str5 = String.valueOf(map2.get("target_account_id"));
        } else {
            str5 = null;
        }
        C145358kN r3 = r18;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        if (bool == null || !bool.booleanValue()) {
            List list3 = list;
            C120967Dk A00 = A00(str6, list3);
            map2.put("public_key", A00.A07);
            map2.put(C62443a0.A00(0, 9, 107), C1198677j.A00());
            map2.put("caps", list3);
            map2.put("app_id", context.getPackageName());
            map2.put("auth_ticket_type", A00.A03);
            HashSet A0u = C18200wM.A0u();
            A0u.add(A00);
            try {
                C120967Dk A03 = AnonymousClass76O.A00().A03();
                if (A03 != null) {
                    map2.put("assoc_public_key", A03.A07);
                    A0u.add(A03);
                }
            } catch (KeyStoreException | NoSuchAlgorithmException unused) {
            }
            C120977Dl A01 = A01(str7, str6, str8, str9, str5, A0u, list2, map2);
            if (!str7.equals("ADD_CARD")) {
                AnonymousClass7Kx.A0H(C92975kL.A00(A01), C86114wI.A0Q(new IDxAObserverShape4S2200000_2_I2(r3, A01, str8, str9, 1), 215));
                return;
            }
            M5J A032 = C99056Hy.A00(new C114676ti(A00, A01), AnonymousClass86P.A00, AnonymousClass86Q.A00, AnonymousClass86R.A00).A03();
            SettableFuture settableFuture = new SettableFuture();
            AnonymousClass7Kx.A0H(A032, C86114wI.A0Q(settableFuture, 216));
            C30954Gc6.A03(new IDxFCallbackShape314S0100000_2_I2(r3, 5), settableFuture, AnonymousClass7Kz.A0C().A00.A03);
            return;
        }
        HashSet A0u2 = C18200wM.A0u();
        List list4 = AnonymousClass76O.A00().A04;
        boolean equalsIgnoreCase = str7.equalsIgnoreCase("GENERATE_AND_SEND_MFT_OTP");
        int size = list4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C120967Dk r4 = (C120967Dk) list4.get(size);
            if (("PIN".equals(r4.A03) || equalsIgnoreCase) && r4.A00 > System.currentTimeMillis() && r4.A04.equalsIgnoreCase("VALID")) {
                A0u2.add(r4);
                break;
            }
        }
        C111816oT r42 = AnonymousClass6D5.A00;
        if (r42 == null) {
            r42 = new C111816oT();
            AnonymousClass6D5.A00 = r42;
        }
        ConcurrentHashMap concurrentHashMap = r42.A00;
        List list5 = (List) concurrentHashMap.get(str9);
        if (list5 == null) {
            list5 = new CopyOnWriteArrayList();
            concurrentHashMap.put(str9, new CopyOnWriteArrayList());
        }
        if (!list5.isEmpty()) {
            A0u2.addAll(list5);
        }
        try {
            C120967Dk A033 = AnonymousClass76O.A00().A03();
            if (A033 != null) {
                map2.put("assoc_public_key", A033.A07);
                A0u2.add(A033);
            }
        } catch (KeyStoreException | NoSuchAlgorithmException unused2) {
        }
        AnonymousClass7Kx.A0H(C92975kL.A00(A01(str7, str6, str8, str9, (String) null, A0u2, Collections.EMPTY_LIST, map2)), C86114wI.A0Q(new AnonymousClass7kD(r3, r42, str9), 215));
    }

    public static C120967Dk A00(String str, List list) {
        try {
            return AnonymousClass76O.A00().A05(str, list);
        } catch (NoSuchAlgorithmException e) {
            throw new AnonymousClass6CR(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new AnonymousClass6CR(e2);
        } catch (IOException e3) {
            throw new AnonymousClass6CR(e3);
        } catch (NoSuchProviderException e4) {
            throw new AnonymousClass6CR(e4);
        } catch (IllegalAccessException e5) {
            throw new AnonymousClass6CR(e5);
        } catch (InstantiationException e6) {
            throw new AnonymousClass6CR(e6);
        } catch (CertificateException e7) {
            throw new AnonymousClass6CR(e7);
        } catch (KeyStoreException e8) {
            throw new AnonymousClass6CR(e8);
        } catch (NoSuchMethodException e9) {
            throw new AnonymousClass6CR(e9);
        } catch (InvocationTargetException e10) {
            throw new AnonymousClass6CR(e10);
        }
    }

    public static C120977Dl A01(String str, String str2, String str3, String str4, String str5, HashSet hashSet, List list, Map map) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("PAYMENT_TYPE", str3);
        A0y.put("AUTH_METHOD_TYPE", str2);
        boolean startsWith = str4.startsWith("upl");
        String A00 = C62443a0.A00(9, 10, 0);
        if (!startsWith) {
            A0y.put(A00, AnonymousClass00U.A0L("upl_", str4));
        } else {
            A0y.put(A00, str4);
        }
        AnonymousClass7HL A002 = AnonymousClass76O.A00();
        return C120977Dl.A00(new IDxSCallbackShape852S0100000_2_I2(A002, 1), new C107406gh(map, new HashSet(list)), str, str5, (String) null, (String) null, (String) null, A0y, hashSet);
    }
}
