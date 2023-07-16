package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.instagram.preferences.common.Nux;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* renamed from: X.0dG  reason: invalid class name and case insensitive filesystem */
public final class C08370dG {
    public static final SharedPreferences A00(Context context) {
        C08400dJ r6 = new C08400dJ(PreferenceManager.getDefaultSharedPreferences(context));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Field[] declaredFields = C08350dD.class.getDeclaredFields();
        C04220Ms.A06(declaredFields);
        ArrayList<Field> arrayList = new ArrayList<>();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Nux.class) && C04220Ms.A0I(field.getType(), String.class)) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList(C02260Al.A0z(arrayList, 10));
        for (Field field2 : arrayList) {
            field2.setAccessible(true);
            Annotation annotation = field2.getAnnotation(Nux.class);
            C04220Ms.A06(annotation);
            Nux nux = (Nux) annotation;
            Object obj = field2.get((Object) null);
            if (obj instanceof String) {
                linkedHashMap.put(obj, Boolean.valueOf(nux.getBooleanAlwaysReturn()));
                linkedHashMap2.put(obj, Integer.valueOf(nux.getIntAlwaysReturn()));
            }
            arrayList2.add(Unit.A00);
        }
        return new C37461Jt7(r6, linkedHashMap, linkedHashMap2);
    }
}
