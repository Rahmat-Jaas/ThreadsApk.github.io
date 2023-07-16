package X;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.webkit.URLUtil;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3JH  reason: invalid class name */
public final class AnonymousClass3JH {
    public static AnonymousClass374 A01(Intent intent) {
        AnonymousClass374 A01;
        Uri uri;
        if (intent == null) {
            return null;
        }
        JSONObject A0y = C18230wP.A0y();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0y.put("action", intent.getAction());
        A0y.put("package", intent.getPackage());
        A0y.put("type", intent.getType());
        Uri data = intent.getData();
        if (data != null) {
            A0v.add(data);
            A0y.put("data", C10730ip.A00(data, (C16120sW) null).A01());
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            JSONArray A0i = C18250wR.A0i();
            for (int i = 0; i < clipData.getItemCount(); i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                    A0v.add(uri);
                    A0i.put(C10730ip.A00(uri, (C16120sW) null).A01());
                }
            }
            A0y.put("clip_data", A0i);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null && !categories.isEmpty()) {
            JSONArray A0i2 = C18250wR.A0i();
            Iterator<String> it = categories.iterator();
            while (it.hasNext()) {
                C18210wN.A1R(it, A0i2);
            }
            A0y.put("categories", A0i2);
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            A0y.put("component_name", component.toString());
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            A0y.put("source_bounds", sourceBounds.toString());
        }
        Bundle extras = intent.getExtras();
        if (extras != null && extras.size() > 0) {
            JSONArray A0i3 = C18250wR.A0i();
            Iterator<String> it2 = extras.keySet().iterator();
            while (it2.hasNext()) {
                String A0k = C18180wK.A0k(it2);
                JSONObject A0y2 = C18230wP.A0y();
                Object obj = null;
                try {
                    obj = extras.get(A0k);
                } catch (BadParcelableException unused) {
                }
                String str = "";
                if (obj != null) {
                    str = obj.getClass().getCanonicalName();
                }
                A0y2.put(FXPFAccessLibraryDebugFragment.NAME, A0k);
                A0y2.put("value_type", str);
                if (obj != null) {
                    URLUtil.isValidUrl(obj.toString());
                }
                A0i3.put(A0y2);
            }
            A0y.put("extra_names", A0i3);
        }
        Intent selector = intent.getSelector();
        if (!(selector == null || (A01 = A01(selector)) == null)) {
            A0y.put(I17.A00(HttpStatus.SC_TEMPORARY_REDIRECT), A01.A01);
        }
        if (intent.getFlags() > 0) {
            A0y.put("flags", intent.getFlags());
        }
        return new AnonymousClass374(A0v, A0y);
    }

    public static AnonymousClass374 A00(Intent intent) {
        return A01(intent);
    }
}
