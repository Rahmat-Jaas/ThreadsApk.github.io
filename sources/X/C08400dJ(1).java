package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0dJ  reason: invalid class name and case insensitive filesystem */
public final class C08400dJ implements SharedPreferences {
    public final SharedPreferences A00;

    public C08400dJ(SharedPreferences sharedPreferences) {
        int A03 = C14030oh.A03(349242436);
        this.A00 = sharedPreferences;
        C14030oh.A0A(-1076474230, A03);
    }

    public final boolean contains(String str) {
        int A03 = C14030oh.A03(557890237);
        boolean contains = this.A00.contains(str);
        C14030oh.A0A(371427628, A03);
        return contains;
    }

    public final SharedPreferences.Editor edit() {
        int A03 = C14030oh.A03(430908863);
        SharedPreferences.Editor edit = this.A00.edit();
        C14030oh.A0A(1703417332, A03);
        return edit;
    }

    public final Map getAll() {
        int A03 = C14030oh.A03(191947340);
        AnonymousClass0LU.A0G("IgSharedPreferences", "getAll was used, which can cause ConcurrentModificationExceptions", new Throwable());
        Map<String, ?> all = this.A00.getAll();
        C14030oh.A0A(1504450301, A03);
        return all;
    }

    public final boolean getBoolean(String str, boolean z) {
        int A03 = C14030oh.A03(-927187819);
        boolean z2 = this.A00.getBoolean(str, z);
        C14030oh.A0A(-1127056574, A03);
        return z2;
    }

    public final float getFloat(String str, float f) {
        int A03 = C14030oh.A03(-1259771365);
        float f2 = this.A00.getFloat(str, f);
        C14030oh.A0A(-122940795, A03);
        return f2;
    }

    public final int getInt(String str, int i) {
        int A03 = C14030oh.A03(711251575);
        int i2 = this.A00.getInt(str, i);
        C14030oh.A0A(-158581498, A03);
        return i2;
    }

    public final long getLong(String str, long j) {
        int A03 = C14030oh.A03(1392832346);
        long j2 = this.A00.getLong(str, j);
        C14030oh.A0A(610034649, A03);
        return j2;
    }

    public final String getString(String str, String str2) {
        int A03 = C14030oh.A03(-513858548);
        String string = this.A00.getString(str, str2);
        C14030oh.A0A(1812851463, A03);
        return string;
    }

    public final Set getStringSet(String str, Set set) {
        int A03 = C14030oh.A03(442049262);
        Set<String> stringSet = this.A00.getStringSet(str, set);
        if (stringSet != null) {
            stringSet = new HashSet<>(stringSet);
        }
        C14030oh.A0A(-1446665522, A03);
        return stringSet;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A03 = C14030oh.A03(1639443698);
        this.A00.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        C14030oh.A0A(-1814990386, A03);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A03 = C14030oh.A03(-1923049483);
        this.A00.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        C14030oh.A0A(-496712432, A03);
    }
}
