package X;

import android.text.TextUtils;
import android.util.Patterns;
import java.text.BreakIterator;
import java.util.Collection;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.0hA  reason: invalid class name */
public final class AnonymousClass0hA {
    public static final Pattern A00 = Pattern.compile("((?<=(^|\\W))(#[a-z0-9_]+(\\.[a-z0-9_]+)*))", 2);
    public static final Pattern A01 = Pattern.compile("(@[a-z0-9_]+(\\.[a-z0-9_]+)*)", 2);
    public static final Pattern A02 = Pattern.compile("((?<=(^|\\W))(@[a-z0-9_]+(\\.[a-z0-9_]+)*))", 2);
    public static final Pattern A03 = Pattern.compile("(@\\[\\][\\u200a]?[0-9]+)", 2);
    public static final Pattern A04 = Pattern.compile("[ - 　]+");
    public static final Pattern A05 = Pattern.compile("\\$((\\d{1,3}(,\\d{3})*)|\\d+)(\\.\\d{1,2})?(?=\\s|\\.\\s|\\,\\s|$|\\.$|\\,$|\\?|\\!)", 2);
    public static final Pattern A06 = Pattern.compile("\\s+");
    public static volatile Pattern A07;
    public static volatile Pattern A08;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x001f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(int r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = 0
            if (r8 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004a
            int r5 = r8.length()
            int r4 = r9.length()
            int r0 = r7 + r4
            if (r0 > r5) goto L_0x004a
            r3 = 0
            r2 = 0
        L_0x0013:
            if (r3 >= r4) goto L_0x0049
            char r0 = r9.charAt(r3)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0022
        L_0x001f:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0022:
            int r1 = r7 + r3
            int r1 = r1 + r2
            if (r1 >= r5) goto L_0x0034
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0034
            int r2 = r2 + 1
            goto L_0x0022
        L_0x0034:
            if (r1 >= r5) goto L_0x004a
            char r0 = r8.charAt(r1)
            char r1 = java.lang.Character.toLowerCase(r0)
            char r0 = r9.charAt(r3)
            char r0 = java.lang.Character.toLowerCase(r0)
            if (r1 == r0) goto L_0x001f
            return r6
        L_0x0049:
            r6 = 1
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0hA.A06(int, java.lang.String, java.lang.String):boolean");
    }

    public static boolean A0E(String str, String str2) {
        for (int i = 0; i <= str.length() - str2.length(); i++) {
            if ((i == 0 || Character.isWhitespace(str.charAt(i - 1))) && A06(i, str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static String A02(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return A06.matcher(charSequence.toString().trim()).replaceAll(" ");
    }

    public static String A04(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object next : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            if (next != null) {
                sb.append(next.toString());
            }
        }
        return sb.toString();
    }

    public static boolean A07(CharSequence charSequence) {
        if (A08 == null) {
            try {
                A08 = Pattern.compile("\\x{23}\\x{20e3}|\\x{2a}\\x{20e3}|\\x{30}\\x{20e3}|\\x{31}\\x{20e3}|\\x{32}\\x{20e3}|\\x{33}\\x{20e3}|\\x{34}\\x{20e3}|\\x{35}\\x{20e3}|\\x{36}\\x{20e3}|\\x{37}\\x{20e3}|\\x{38}\\x{20e3}|\\x{39}\\x{20e3}|\\x{a9}\\x{fe0f}|\\x{ae}\\x{fe0f}|\\x{203c}\\x{fe0f}|\\x{2049}\\x{fe0f}|\\x{2122}\\x{fe0f}|\\x{2139}\\x{fe0f}|\\x{2194}\\x{fe0f}|\\x{2195}\\x{fe0f}|\\x{2196}\\x{fe0f}|\\x{2197}\\x{fe0f}|\\x{2198}\\x{fe0f}|\\x{2199}\\x{fe0f}|\\x{21a9}\\x{fe0f}|\\x{21aa}\\x{fe0f}|\\x{2328}\\x{fe0f}|\\x{23cf}\\x{fe0f}|\\x{23ed}\\x{fe0f}|\\x{23ee}\\x{fe0f}|\\x{23ef}\\x{fe0f}|\\x{23f1}\\x{fe0f}|\\x{23f2}\\x{fe0f}|\\x{23f8}\\x{fe0f}|\\x{23f9}\\x{fe0f}|\\x{23fa}\\x{fe0f}|\\x{24c2}\\x{fe0f}|\\x{25aa}\\x{fe0f}|\\x{25ab}\\x{fe0f}|\\x{25b6}\\x{fe0f}|\\x{25c0}\\x{fe0f}|\\x{25fb}\\x{fe0f}|\\x{25fc}\\x{fe0f}|\\x{2600}\\x{fe0f}|\\x{2601}\\x{fe0f}|\\x{2602}\\x{fe0f}|\\x{2603}\\x{fe0f}|\\x{2604}\\x{fe0f}|\\x{260e}\\x{fe0f}|\\x{2611}\\x{fe0f}|\\x{2618}\\x{fe0f}|\\x{261d}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{2620}\\x{fe0f}|\\x{2622}\\x{fe0f}|\\x{2623}\\x{fe0f}|\\x{2626}\\x{fe0f}|\\x{262a}\\x{fe0f}|\\x{262e}\\x{fe0f}|\\x{262f}\\x{fe0f}|\\x{2638}\\x{fe0f}|\\x{2639}\\x{fe0f}|\\x{263a}\\x{fe0f}|\\x{2640}\\x{fe0f}|\\x{2642}\\x{fe0f}|\\x{265f}\\x{fe0f}|\\x{2660}\\x{fe0f}|\\x{2663}\\x{fe0f}|\\x{2665}\\x{fe0f}|\\x{2666}\\x{fe0f}|\\x{2668}\\x{fe0f}|\\x{267b}\\x{fe0f}|\\x{267e}\\x{fe0f}|\\x{2692}\\x{fe0f}|\\x{2694}\\x{fe0f}|\\x{2695}\\x{fe0f}|\\x{2696}\\x{fe0f}|\\x{2697}\\x{fe0f}|\\x{2699}\\x{fe0f}|\\x{269b}\\x{fe0f}|\\x{269c}\\x{fe0f}|\\x{26a0}\\x{fe0f}|\\x{26a7}\\x{fe0f}|\\x{26b0}\\x{fe0f}|\\x{26b1}\\x{fe0f}|\\x{26c8}\\x{fe0f}|\\x{26cf}\\x{fe0f}|\\x{26d1}\\x{fe0f}|\\x{26d3}\\x{fe0f}|\\x{26e9}\\x{fe0f}|\\x{26f0}\\x{fe0f}|\\x{26f1}\\x{fe0f}|\\x{26f4}\\x{fe0f}|\\x{26f7}\\x{fe0f}|\\x{26f8}\\x{fe0f}|\\x{26f9}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{2702}\\x{fe0f}|\\x{2708}\\x{fe0f}|\\x{2709}\\x{fe0f}|\\x{270a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{270b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{270c}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{270d}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{270f}\\x{fe0f}|\\x{2712}\\x{fe0f}|\\x{2714}\\x{fe0f}|\\x{2716}\\x{fe0f}|\\x{271d}\\x{fe0f}|\\x{2721}\\x{fe0f}|\\x{2733}\\x{fe0f}|\\x{2734}\\x{fe0f}|\\x{2744}\\x{fe0f}|\\x{2747}\\x{fe0f}|\\x{2763}\\x{fe0f}|\\x{2764}\\x{fe0f}|\\x{27a1}\\x{fe0f}|\\x{2934}\\x{fe0f}|\\x{2935}\\x{fe0f}|\\x{2b05}\\x{fe0f}|\\x{2b06}\\x{fe0f}|\\x{2b07}\\x{fe0f}|\\x{3030}\\x{fe0f}|\\x{303d}\\x{fe0f}|\\x{3297}\\x{fe0f}|\\x{3299}\\x{fe0f}|\\x{1f170}\\x{fe0f}|\\x{1f171}\\x{fe0f}|\\x{1f17e}\\x{fe0f}|\\x{1f17f}\\x{fe0f}|\\x{1f1e6}[\\x{1f1e8}-\\x{1f1ec}\\x{1f1ee}\\x{1f1f1}\\x{1f1f2}\\x{1f1f4}\\x{1f1f6}-\\x{1f1fa}\\x{1f1fc}\\x{1f1fd}\\x{1f1ff}]|\\x{1f1e7}[\\x{1f1e6}\\x{1f1e7}\\x{1f1e9}-\\x{1f1ef}\\x{1f1f1}-\\x{1f1f4}\\x{1f1f6}-\\x{1f1f9}\\x{1f1fb}\\x{1f1fc}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1e8}[\\x{1f1e6}\\x{1f1e8}\\x{1f1e9}\\x{1f1eb}-\\x{1f1ee}\\x{1f1f0}-\\x{1f1f5}\\x{1f1f7}\\x{1f1fa}-\\x{1f1ff}]|\\x{1f1e9}[\\x{1f1ea}\\x{1f1ec}\\x{1f1ef}\\x{1f1f0}\\x{1f1f2}\\x{1f1f4}\\x{1f1ff}]|\\x{1f1ea}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}\\x{1f1ec}\\x{1f1ed}\\x{1f1f7}-\\x{1f1fa}]|\\x{1f1eb}[\\x{1f1ee}-\\x{1f1f0}\\x{1f1f2}\\x{1f1f4}\\x{1f1f7}]|\\x{1f1ec}[\\x{1f1e6}\\x{1f1e7}\\x{1f1e9}-\\x{1f1ee}\\x{1f1f1}-\\x{1f1f3}\\x{1f1f5}-\\x{1f1fa}\\x{1f1fc}\\x{1f1fe}]|\\x{1f1ed}[\\x{1f1f0}\\x{1f1f2}\\x{1f1f3}\\x{1f1f7}\\x{1f1f9}\\x{1f1fa}]|\\x{1f1ee}[\\x{1f1e8}-\\x{1f1ea}\\x{1f1f1}-\\x{1f1f4}\\x{1f1f6}-\\x{1f1f9}]|\\x{1f1ef}[\\x{1f1ea}\\x{1f1f2}\\x{1f1f4}\\x{1f1f5}]|\\x{1f1f0}[\\x{1f1ea}\\x{1f1ec}-\\x{1f1ee}\\x{1f1f2}\\x{1f1f3}\\x{1f1f5}\\x{1f1f7}\\x{1f1fc}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1f1}[\\x{1f1e6}-\\x{1f1e8}\\x{1f1ee}\\x{1f1f0}\\x{1f1f7}-\\x{1f1fb}\\x{1f1fe}]|\\x{1f1f2}[\\x{1f1e6}\\x{1f1e8}-\\x{1f1ed}\\x{1f1f0}-\\x{1f1ff}]|\\x{1f1f3}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}-\\x{1f1ec}\\x{1f1ee}\\x{1f1f1}\\x{1f1f4}\\x{1f1f5}\\x{1f1f7}\\x{1f1fa}\\x{1f1ff}]|\\x{1f1f4}\\x{1f1f2}|\\x{1f1f5}[\\x{1f1e6}\\x{1f1ea}-\\x{1f1ed}\\x{1f1f0}-\\x{1f1f3}\\x{1f1f7}-\\x{1f1f9}\\x{1f1fc}\\x{1f1fe}]|\\x{1f1f6}\\x{1f1e6}|\\x{1f1f7}[\\x{1f1ea}\\x{1f1f4}\\x{1f1f8}\\x{1f1fa}\\x{1f1fc}]|\\x{1f1f8}[\\x{1f1e6}-\\x{1f1ea}\\x{1f1ec}-\\x{1f1f4}\\x{1f1f7}-\\x{1f1f9}\\x{1f1fb}\\x{1f1fd}-\\x{1f1ff}]|\\x{1f1f9}[\\x{1f1e6}\\x{1f1e8}\\x{1f1e9}\\x{1f1eb}-\\x{1f1ed}\\x{1f1ef}-\\x{1f1f4}\\x{1f1f7}\\x{1f1f9}\\x{1f1fb}\\x{1f1fc}\\x{1f1ff}]|\\x{1f1fa}[\\x{1f1e6}\\x{1f1ec}\\x{1f1f2}\\x{1f1f3}\\x{1f1f8}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1fb}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}\\x{1f1ec}\\x{1f1ee}\\x{1f1f3}\\x{1f1fa}]|\\x{1f1fc}[\\x{1f1eb}\\x{1f1f8}]|\\x{1f1fd}\\x{1f1f0}|\\x{1f1fe}[\\x{1f1ea}\\x{1f1f9}]|\\x{1f1ff}[\\x{1f1e6}\\x{1f1f2}\\x{1f1fc}]|\\x{1f202}\\x{fe0f}|\\x{1f237}\\x{fe0f}|\\x{1f321}\\x{fe0f}|\\x{1f324}\\x{fe0f}|\\x{1f325}\\x{fe0f}|\\x{1f326}\\x{fe0f}|\\x{1f327}\\x{fe0f}|\\x{1f328}\\x{fe0f}|\\x{1f329}\\x{fe0f}|\\x{1f32a}\\x{fe0f}|\\x{1f32b}\\x{fe0f}|\\x{1f32c}\\x{fe0f}|\\x{1f336}\\x{fe0f}|\\x{1f37d}\\x{fe0f}|\\x{1f385}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f396}\\x{fe0f}|\\x{1f397}\\x{fe0f}|\\x{1f399}\\x{fe0f}|\\x{1f39a}\\x{fe0f}|\\x{1f39b}\\x{fe0f}|\\x{1f39e}\\x{fe0f}|\\x{1f39f}\\x{fe0f}|\\x{1f3c2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3ca}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3cb}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f3cc}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f3cd}\\x{fe0f}|\\x{1f3ce}\\x{fe0f}|\\x{1f3d4}\\x{fe0f}|\\x{1f3d5}\\x{fe0f}|\\x{1f3d6}\\x{fe0f}|\\x{1f3d7}\\x{fe0f}|\\x{1f3d8}\\x{fe0f}|\\x{1f3d9}\\x{fe0f}|\\x{1f3da}\\x{fe0f}|\\x{1f3db}\\x{fe0f}|\\x{1f3dc}\\x{fe0f}|\\x{1f3dd}\\x{fe0f}|\\x{1f3de}\\x{fe0f}|\\x{1f3df}\\x{fe0f}|\\x{1f3f3}\\x{fe0f}|\\x{1f3f5}\\x{fe0f}|\\x{1f3f7}\\x{fe0f}|\\x{1f43f}\\x{fe0f}|\\x{1f441}\\x{fe0f}|\\x{1f442}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f443}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f446}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f447}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f448}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f449}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f450}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f466}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f467}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f468}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f469}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f470}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f471}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f472}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f473}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f474}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f475}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f476}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f477}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f478}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f47c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f481}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f482}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f483}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f485}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f486}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f487}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f48f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f491}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f4aa}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f4fd}\\x{fe0f}|\\x{1f549}\\x{fe0f}|\\x{1f54a}\\x{fe0f}|\\x{1f56f}\\x{fe0f}|\\x{1f570}\\x{fe0f}|\\x{1f573}\\x{fe0f}|\\x{1f574}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f575}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f576}\\x{fe0f}|\\x{1f577}\\x{fe0f}|\\x{1f578}\\x{fe0f}|\\x{1f579}\\x{fe0f}|\\x{1f57a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f587}\\x{fe0f}|\\x{1f58a}\\x{fe0f}|\\x{1f58b}\\x{fe0f}|\\x{1f58c}\\x{fe0f}|\\x{1f58d}\\x{fe0f}|\\x{1f590}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f595}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f596}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f5a5}\\x{fe0f}|\\x{1f5a8}\\x{fe0f}|\\x{1f5b1}\\x{fe0f}|\\x{1f5b2}\\x{fe0f}|\\x{1f5bc}\\x{fe0f}|\\x{1f5c2}\\x{fe0f}|\\x{1f5c3}\\x{fe0f}|\\x{1f5c4}\\x{fe0f}|\\x{1f5d1}\\x{fe0f}|\\x{1f5d2}\\x{fe0f}|\\x{1f5d3}\\x{fe0f}|\\x{1f5dc}\\x{fe0f}|\\x{1f5dd}\\x{fe0f}|\\x{1f5de}\\x{fe0f}|\\x{1f5e1}\\x{fe0f}|\\x{1f5e3}\\x{fe0f}|\\x{1f5e8}\\x{fe0f}|\\x{1f5ef}\\x{fe0f}|\\x{1f5f3}\\x{fe0f}|\\x{1f5fa}\\x{fe0f}|\\x{1f645}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f646}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f647}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6a3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6c0}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6cb}\\x{fe0f}|\\x{1f6cc}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6cd}\\x{fe0f}|\\x{1f6ce}\\x{fe0f}|\\x{1f6cf}\\x{fe0f}|\\x{1f6e0}\\x{fe0f}|\\x{1f6e1}\\x{fe0f}|\\x{1f6e2}\\x{fe0f}|\\x{1f6e3}\\x{fe0f}|\\x{1f6e4}\\x{fe0f}|\\x{1f6e5}\\x{fe0f}|\\x{1f6e9}\\x{fe0f}|\\x{1f6f0}\\x{fe0f}|\\x{1f6f3}\\x{fe0f}|\\x{1f90c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f90f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f918}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f919}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f926}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f930}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f931}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f932}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f933}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f934}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f935}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f936}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f937}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f938}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f939}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f93d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f93e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f977}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b8}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b9}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9bb}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9cd}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9ce}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9cf}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d1}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d8}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d9}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9da}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9db}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9dc}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9dd}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf0}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf1}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf8}[\\x{1f3fb}-\\x{1f3ff}]|[\\x{2712}\\x{2714}\\x{2716}\\x{271d}\\x{2721}\\x{2728}\\x{2733}\\x{2734}\\x{2744}\\x{2747}\\x{274c}\\x{274e}\\x{2753}-\\x{2755}\\x{2757}\\x{2763}\\x{2764}\\x{2795}-\\x{2797}\\x{27a1}\\x{27b0}\\x{27bf}\\x{2934}\\x{2935}\\x{2b05}-\\x{2b07}\\x{2b1b}\\x{2b1c}\\x{2b50}\\x{2b55}\\x{3030}\\x{303d}\\x{1f004}\\x{1f0cf}\\x{1f170}\\x{1f171}\\x{1f17e}\\x{1f17f}\\x{1f18e}\\x{1f191}-\\x{1f19a}\\x{1f201}\\x{1f202}\\x{1f21a}\\x{1f22f}\\x{1f232}-\\x{1f23a}\\x{1f250}\\x{1f251}\\x{1f300}-\\x{1f321}\\x{1f324}-\\x{1f393}\\x{1f396}\\x{1f397}\\x{1f399}-\\x{1f39b}\\x{1f39e}-\\x{1f3f0}\\x{1f3f3}-\\x{1f3f5}\\x{1f3f7}-\\x{1f4fd}\\x{1f4ff}-\\x{1f53d}\\x{1f549}-\\x{1f54e}\\x{1f550}-\\x{1f567}\\x{1f56f}\\x{1f570}\\x{1f573}-\\x{1f57a}\\x{1f587}\\x{1f58a}-\\x{1f58d}\\x{1f590}\\x{1f595}\\x{1f596}\\x{1f5a4}\\x{1f5a5}\\x{1f5a8}\\x{1f5b1}\\x{1f5b2}\\x{1f5bc}\\x{1f5c2}-\\x{1f5c4}\\x{1f5d1}-\\x{1f5d3}\\x{1f5dc}-\\x{1f5de}\\x{1f5e1}\\x{1f5e3}\\x{1f5e8}\\x{1f5ef}\\x{1f5f3}\\x{1f5fa}-\\x{1f64f}\\x{1f680}-\\x{1f6c5}\\x{1f6cb}-\\x{1f6d2}\\x{1f6d5}-\\x{1f6d7}\\x{1f6dc}-\\x{1f6e5}\\x{1f6e9}\\x{1f6eb}\\x{1f6ec}\\x{1f6f0}\\x{1f6f3}-\\x{1f6fc}\\x{1f7e0}-\\x{1f7eb}\\x{1f7f0}\\x{1f90c}-\\x{1f93a}\\x{1f93c}-\\x{1f945}\\x{1f947}-\\x{1f9e5}\\x{3297}\\x{1f9e6}-\\x{1f9f9}\\x{3299}\\x{1f9fa}-\\x{1f9ff}\\x{1fa70}-\\x{1fa7c}\\x{1fa80}-\\x{1fa88}\\x{1fa90}-\\x{1fabd}\\x{1fabf}-\\x{1fac5}\\x{1face}-\\x{1fadb}\\x{1fae0}-\\x{1fae8}\\x{1faf0}-\\x{1faf8}\\x{a9}\\x{ae}\\x{203c}\\x{2049}\\x{2122}\\x{2139}\\x{2194}-\\x{2199}\\x{21a9}\\x{21aa}\\x{231a}\\x{231b}\\x{2328}\\x{23cf}\\x{23e9}-\\x{23f3}\\x{23f8}-\\x{23fa}\\x{24c2}\\x{25aa}\\x{25ab}\\x{25b6}\\x{25c0}\\x{25fb}-\\x{25fe}\\x{2600}-\\x{2604}\\x{260e}\\x{2611}\\x{2614}\\x{2615}\\x{2618}\\x{261d}\\x{2620}\\x{2622}\\x{2623}\\x{2626}\\x{262a}\\x{262e}\\x{262f}\\x{2638}-\\x{263a}\\x{2640}\\x{2642}\\x{2648}-\\x{2653}\\x{265f}\\x{2660}\\x{2663}\\x{2665}\\x{2666}\\x{2668}\\x{267b}\\x{267e}\\x{267f}\\x{2692}-\\x{2697}\\x{2699}\\x{269b}\\x{269c}\\x{26a0}\\x{26a1}\\x{26a7}\\x{26aa}\\x{26ab}\\x{26b0}\\x{26b1}\\x{26bd}\\x{26be}\\x{26c4}\\x{26c5}\\x{26c8}\\x{26ce}\\x{26cf}\\x{26d1}\\x{26d3}\\x{26d4}\\x{26e9}\\x{26ea}\\x{26f0}-\\x{26f5}\\x{26f7}-\\x{26fa}\\x{26fd}\\x{2702}\\x{2705}\\x{2708}-\\x{270d}\\x{270f}]|[\\x{fe00}-\\x{fe0f}\\x{200d}]|[#*0-9]\\x{fe0f}\\x{20e3}|[\\x{1f1e6}-\\x{1f1ff}]", 66);
            } catch (PatternSyntaxException unused) {
                A08 = Pattern.compile("[🀄🅰🅱🅾🅿🆎🆒🆔🆕🆗🆙🆚🇧🇨🇩🇪🇪🇫🇬🇮🇯🇰🇳🇵🇷🇷🇷🇸🇸🇹🇺🇺🈁🈂🈚🈯🈳🈵🈶🈷🈸🈹🈺🉐🌀🌂🌃🌄🌅🌆🌇🌈🌊🌙🌟🌴🌵🌷🌸🌹🌺🌻🌾🍀🍁🍂🍃🍅🍆🍉🍊🍎🍓🍔🍘🍙🍚🍛🍜🍝🍞🍟🍡🍢🍣🍦🍧🍰🍱🍲🍳🍴🍵🍶🍸🍺🍻🎀🎁🎂🎃🎄🎅🎆🎇🎈🎉🎌🎍🎎🎏🎐🎑🎒🎓🎡🎢🎤🎥🎦🎧🎨🎩🎫🎬🎯🎰🎱🎵🎶🎷🎸🎺🎾🎿🏀🏁🏃🏄🏆🏈🏊🏠🏢🏣🏥🏦🏧🏨🏩🏪🏫🏬🏭🏯🏰🐍🐎🐑🐒🐔🐗🐘🐙🐚🐛🐟🐠🐤🐦🐧🐨🐫🐬🐭🐮🐯🐰🐱🐳🐴🐵🐶🐷🐸🐹🐺🐻👀👂👃👄👆👇👈👉👊👋👌👍👎👏👐👑👒👔👕👗👘👙👜👟👠👡👢👣👦👧👨👩👫👮👯👱👲👳👴👵👶👷👸👻👼👽👾👿💀💁💂💃💄💅💆💇💈💉💊💋💍💎💏💐💑💒💓💔💗💘💙💚💛💜💝💟💡💢💣💤💦💨💩💪💰💱💱💹💹💺💻💼💽💿📀📖📝📠📡📢📣📩📫📮📱📲📳📴📶📷📺📻📼🔊🔍🔑🔒🔓🔔🔝🔞🔥🔨🔫🔯🔰🔱🔲🔳🔴🕐🕑🕒🕓🕔🕕🕖🕗🕘🕙🕚🕛🗻🗼🗽😁😂😃😄😉😊😌😍😏😒😓😔😖😘😚😜😝😞😠😡😢😣😥😨😪😭😰😱😲😳😷🙅🙆🙇🙌🙏🚀🚃🚄🚅🚇🚉🚌🚏🚑🚒🚓🚕🚗🚙🚚🚢🚤🚥🚧🚬🚭🚲🚶🚹🚺🚻🚼🚽🚾🛀☺✨❕❔✊✌✋☝☀☔☁⛄⚡☕〽♦♣♠⛳⚾⚽➿☎✂⛪⛺⛵⛲♨⚠⛽⃣⃣⃣⃣⃣⃣⃣⬅⬇⬆⃣⃣⃣⃣➡↗↖↘↙◀▶⏪⏩♿✳㊗㊙✴♈♉♊♋♌♍♎⛎♓♒♑♐♏❌⭕]", 66);
            }
        }
        return A08.matcher(charSequence).find();
    }

    public static boolean A0C(String str, String str2) {
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = str2.toLowerCase(locale);
        int i = 0;
        for (int i2 = 0; i2 < lowerCase.length() && i < lowerCase2.length(); i2++) {
            if (lowerCase.charAt(i2) == lowerCase2.charAt(i)) {
                i++;
            }
        }
        if (i == lowerCase2.length()) {
            return true;
        }
        return false;
    }

    public static boolean A0D(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static int A00(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int i = 0;
        while (characterInstance.next() != -1) {
            i++;
        }
        return i;
    }

    public static int A01(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.last();
    }

    public static String A03(String str, int i) {
        if (i < str.length()) {
            return AnonymousClass00U.A0L(str.substring(0, i), "…");
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r6 = r8.split(";");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map A05(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r7 = 0
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = ";"
            java.lang.String[] r6 = r8.split(r0)
            int r5 = r6.length
            if (r5 <= 0) goto L_0x0030
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>(r5)
            r4 = 0
            r3 = 0
        L_0x0017:
            r1 = r6[r3]
            java.lang.String r0 = ","
            java.lang.String[] r2 = r1.split(r0)
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L_0x002b
            r1 = r2[r4]
            r0 = 1
            r0 = r2[r0]
            r7.put(r1, r0)
        L_0x002b:
            int r3 = r3 + 1
            if (r3 >= r5) goto L_0x0030
            goto L_0x0017
        L_0x0030:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0hA.A05(java.lang.String):java.util.Map");
    }

    public static boolean A08(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            for (int i = 0; i < charSequence.length(); i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A09(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(charSequence.toString().trim()).matches();
    }

    public static boolean A0A(String str) {
        if (str.isEmpty() || A00(str) != 1) {
            return false;
        }
        if (A07 == null) {
            try {
                A07 = Pattern.compile("^(\\x{23}\\x{20e3}|\\x{2a}\\x{20e3}|\\x{30}\\x{20e3}|\\x{31}\\x{20e3}|\\x{32}\\x{20e3}|\\x{33}\\x{20e3}|\\x{34}\\x{20e3}|\\x{35}\\x{20e3}|\\x{36}\\x{20e3}|\\x{37}\\x{20e3}|\\x{38}\\x{20e3}|\\x{39}\\x{20e3}|\\x{a9}\\x{fe0f}|\\x{ae}\\x{fe0f}|\\x{203c}\\x{fe0f}|\\x{2049}\\x{fe0f}|\\x{2122}\\x{fe0f}|\\x{2139}\\x{fe0f}|\\x{2194}\\x{fe0f}|\\x{2195}\\x{fe0f}|\\x{2196}\\x{fe0f}|\\x{2197}\\x{fe0f}|\\x{2198}\\x{fe0f}|\\x{2199}\\x{fe0f}|\\x{21a9}\\x{fe0f}|\\x{21aa}\\x{fe0f}|\\x{2328}\\x{fe0f}|\\x{23cf}\\x{fe0f}|\\x{23ed}\\x{fe0f}|\\x{23ee}\\x{fe0f}|\\x{23ef}\\x{fe0f}|\\x{23f1}\\x{fe0f}|\\x{23f2}\\x{fe0f}|\\x{23f8}\\x{fe0f}|\\x{23f9}\\x{fe0f}|\\x{23fa}\\x{fe0f}|\\x{24c2}\\x{fe0f}|\\x{25aa}\\x{fe0f}|\\x{25ab}\\x{fe0f}|\\x{25b6}\\x{fe0f}|\\x{25c0}\\x{fe0f}|\\x{25fb}\\x{fe0f}|\\x{25fc}\\x{fe0f}|\\x{2600}\\x{fe0f}|\\x{2601}\\x{fe0f}|\\x{2602}\\x{fe0f}|\\x{2603}\\x{fe0f}|\\x{2604}\\x{fe0f}|\\x{260e}\\x{fe0f}|\\x{2611}\\x{fe0f}|\\x{2618}\\x{fe0f}|\\x{261d}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{2620}\\x{fe0f}|\\x{2622}\\x{fe0f}|\\x{2623}\\x{fe0f}|\\x{2626}\\x{fe0f}|\\x{262a}\\x{fe0f}|\\x{262e}\\x{fe0f}|\\x{262f}\\x{fe0f}|\\x{2638}\\x{fe0f}|\\x{2639}\\x{fe0f}|\\x{263a}\\x{fe0f}|\\x{2640}\\x{fe0f}|\\x{2642}\\x{fe0f}|\\x{265f}\\x{fe0f}|\\x{2660}\\x{fe0f}|\\x{2663}\\x{fe0f}|\\x{2665}\\x{fe0f}|\\x{2666}\\x{fe0f}|\\x{2668}\\x{fe0f}|\\x{267b}\\x{fe0f}|\\x{267e}\\x{fe0f}|\\x{2692}\\x{fe0f}|\\x{2694}\\x{fe0f}|\\x{2695}\\x{fe0f}|\\x{2696}\\x{fe0f}|\\x{2697}\\x{fe0f}|\\x{2699}\\x{fe0f}|\\x{269b}\\x{fe0f}|\\x{269c}\\x{fe0f}|\\x{26a0}\\x{fe0f}|\\x{26a7}\\x{fe0f}|\\x{26b0}\\x{fe0f}|\\x{26b1}\\x{fe0f}|\\x{26c8}\\x{fe0f}|\\x{26cf}\\x{fe0f}|\\x{26d1}\\x{fe0f}|\\x{26d3}\\x{fe0f}|\\x{26e9}\\x{fe0f}|\\x{26f0}\\x{fe0f}|\\x{26f1}\\x{fe0f}|\\x{26f4}\\x{fe0f}|\\x{26f7}\\x{fe0f}|\\x{26f8}\\x{fe0f}|\\x{26f9}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{2702}\\x{fe0f}|\\x{2708}\\x{fe0f}|\\x{2709}\\x{fe0f}|\\x{270a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{270b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{270c}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{270d}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{270f}\\x{fe0f}|\\x{2712}\\x{fe0f}|\\x{2714}\\x{fe0f}|\\x{2716}\\x{fe0f}|\\x{271d}\\x{fe0f}|\\x{2721}\\x{fe0f}|\\x{2733}\\x{fe0f}|\\x{2734}\\x{fe0f}|\\x{2744}\\x{fe0f}|\\x{2747}\\x{fe0f}|\\x{2763}\\x{fe0f}|\\x{2764}\\x{fe0f}|\\x{27a1}\\x{fe0f}|\\x{2934}\\x{fe0f}|\\x{2935}\\x{fe0f}|\\x{2b05}\\x{fe0f}|\\x{2b06}\\x{fe0f}|\\x{2b07}\\x{fe0f}|\\x{3030}\\x{fe0f}|\\x{303d}\\x{fe0f}|\\x{3297}\\x{fe0f}|\\x{3299}\\x{fe0f}|\\x{1f170}\\x{fe0f}|\\x{1f171}\\x{fe0f}|\\x{1f17e}\\x{fe0f}|\\x{1f17f}\\x{fe0f}|\\x{1f1e6}[\\x{1f1e8}-\\x{1f1ec}\\x{1f1ee}\\x{1f1f1}\\x{1f1f2}\\x{1f1f4}\\x{1f1f6}-\\x{1f1fa}\\x{1f1fc}\\x{1f1fd}\\x{1f1ff}]|\\x{1f1e7}[\\x{1f1e6}\\x{1f1e7}\\x{1f1e9}-\\x{1f1ef}\\x{1f1f1}-\\x{1f1f4}\\x{1f1f6}-\\x{1f1f9}\\x{1f1fb}\\x{1f1fc}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1e8}[\\x{1f1e6}\\x{1f1e8}\\x{1f1e9}\\x{1f1eb}-\\x{1f1ee}\\x{1f1f0}-\\x{1f1f5}\\x{1f1f7}\\x{1f1fa}-\\x{1f1ff}]|\\x{1f1e9}[\\x{1f1ea}\\x{1f1ec}\\x{1f1ef}\\x{1f1f0}\\x{1f1f2}\\x{1f1f4}\\x{1f1ff}]|\\x{1f1ea}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}\\x{1f1ec}\\x{1f1ed}\\x{1f1f7}-\\x{1f1fa}]|\\x{1f1eb}[\\x{1f1ee}-\\x{1f1f0}\\x{1f1f2}\\x{1f1f4}\\x{1f1f7}]|\\x{1f1ec}[\\x{1f1e6}\\x{1f1e7}\\x{1f1e9}-\\x{1f1ee}\\x{1f1f1}-\\x{1f1f3}\\x{1f1f5}-\\x{1f1fa}\\x{1f1fc}\\x{1f1fe}]|\\x{1f1ed}[\\x{1f1f0}\\x{1f1f2}\\x{1f1f3}\\x{1f1f7}\\x{1f1f9}\\x{1f1fa}]|\\x{1f1ee}[\\x{1f1e8}-\\x{1f1ea}\\x{1f1f1}-\\x{1f1f4}\\x{1f1f6}-\\x{1f1f9}]|\\x{1f1ef}[\\x{1f1ea}\\x{1f1f2}\\x{1f1f4}\\x{1f1f5}]|\\x{1f1f0}[\\x{1f1ea}\\x{1f1ec}-\\x{1f1ee}\\x{1f1f2}\\x{1f1f3}\\x{1f1f5}\\x{1f1f7}\\x{1f1fc}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1f1}[\\x{1f1e6}-\\x{1f1e8}\\x{1f1ee}\\x{1f1f0}\\x{1f1f7}-\\x{1f1fb}\\x{1f1fe}]|\\x{1f1f2}[\\x{1f1e6}\\x{1f1e8}-\\x{1f1ed}\\x{1f1f0}-\\x{1f1ff}]|\\x{1f1f3}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}-\\x{1f1ec}\\x{1f1ee}\\x{1f1f1}\\x{1f1f4}\\x{1f1f5}\\x{1f1f7}\\x{1f1fa}\\x{1f1ff}]|\\x{1f1f4}\\x{1f1f2}|\\x{1f1f5}[\\x{1f1e6}\\x{1f1ea}-\\x{1f1ed}\\x{1f1f0}-\\x{1f1f3}\\x{1f1f7}-\\x{1f1f9}\\x{1f1fc}\\x{1f1fe}]|\\x{1f1f6}\\x{1f1e6}|\\x{1f1f7}[\\x{1f1ea}\\x{1f1f4}\\x{1f1f8}\\x{1f1fa}\\x{1f1fc}]|\\x{1f1f8}[\\x{1f1e6}-\\x{1f1ea}\\x{1f1ec}-\\x{1f1f4}\\x{1f1f7}-\\x{1f1f9}\\x{1f1fb}\\x{1f1fd}-\\x{1f1ff}]|\\x{1f1f9}[\\x{1f1e6}\\x{1f1e8}\\x{1f1e9}\\x{1f1eb}-\\x{1f1ed}\\x{1f1ef}-\\x{1f1f4}\\x{1f1f7}\\x{1f1f9}\\x{1f1fb}\\x{1f1fc}\\x{1f1ff}]|\\x{1f1fa}[\\x{1f1e6}\\x{1f1ec}\\x{1f1f2}\\x{1f1f3}\\x{1f1f8}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1fb}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}\\x{1f1ec}\\x{1f1ee}\\x{1f1f3}\\x{1f1fa}]|\\x{1f1fc}[\\x{1f1eb}\\x{1f1f8}]|\\x{1f1fd}\\x{1f1f0}|\\x{1f1fe}[\\x{1f1ea}\\x{1f1f9}]|\\x{1f1ff}[\\x{1f1e6}\\x{1f1f2}\\x{1f1fc}]|\\x{1f202}\\x{fe0f}|\\x{1f237}\\x{fe0f}|\\x{1f321}\\x{fe0f}|\\x{1f324}\\x{fe0f}|\\x{1f325}\\x{fe0f}|\\x{1f326}\\x{fe0f}|\\x{1f327}\\x{fe0f}|\\x{1f328}\\x{fe0f}|\\x{1f329}\\x{fe0f}|\\x{1f32a}\\x{fe0f}|\\x{1f32b}\\x{fe0f}|\\x{1f32c}\\x{fe0f}|\\x{1f336}\\x{fe0f}|\\x{1f37d}\\x{fe0f}|\\x{1f385}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f396}\\x{fe0f}|\\x{1f397}\\x{fe0f}|\\x{1f399}\\x{fe0f}|\\x{1f39a}\\x{fe0f}|\\x{1f39b}\\x{fe0f}|\\x{1f39e}\\x{fe0f}|\\x{1f39f}\\x{fe0f}|\\x{1f3c2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3ca}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3cb}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f3cc}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f3cd}\\x{fe0f}|\\x{1f3ce}\\x{fe0f}|\\x{1f3d4}\\x{fe0f}|\\x{1f3d5}\\x{fe0f}|\\x{1f3d6}\\x{fe0f}|\\x{1f3d7}\\x{fe0f}|\\x{1f3d8}\\x{fe0f}|\\x{1f3d9}\\x{fe0f}|\\x{1f3da}\\x{fe0f}|\\x{1f3db}\\x{fe0f}|\\x{1f3dc}\\x{fe0f}|\\x{1f3dd}\\x{fe0f}|\\x{1f3de}\\x{fe0f}|\\x{1f3df}\\x{fe0f}|\\x{1f3f3}\\x{fe0f}|\\x{1f3f5}\\x{fe0f}|\\x{1f3f7}\\x{fe0f}|\\x{1f43f}\\x{fe0f}|\\x{1f441}\\x{fe0f}|\\x{1f442}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f443}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f446}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f447}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f448}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f449}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f450}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f466}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f467}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f468}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f469}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f470}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f471}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f472}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f473}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f474}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f475}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f476}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f477}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f478}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f47c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f481}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f482}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f483}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f485}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f486}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f487}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f48f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f491}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f4aa}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f4fd}\\x{fe0f}|\\x{1f549}\\x{fe0f}|\\x{1f54a}\\x{fe0f}|\\x{1f56f}\\x{fe0f}|\\x{1f570}\\x{fe0f}|\\x{1f573}\\x{fe0f}|\\x{1f574}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f575}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f576}\\x{fe0f}|\\x{1f577}\\x{fe0f}|\\x{1f578}\\x{fe0f}|\\x{1f579}\\x{fe0f}|\\x{1f57a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f587}\\x{fe0f}|\\x{1f58a}\\x{fe0f}|\\x{1f58b}\\x{fe0f}|\\x{1f58c}\\x{fe0f}|\\x{1f58d}\\x{fe0f}|\\x{1f590}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f595}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f596}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f5a5}\\x{fe0f}|\\x{1f5a8}\\x{fe0f}|\\x{1f5b1}\\x{fe0f}|\\x{1f5b2}\\x{fe0f}|\\x{1f5bc}\\x{fe0f}|\\x{1f5c2}\\x{fe0f}|\\x{1f5c3}\\x{fe0f}|\\x{1f5c4}\\x{fe0f}|\\x{1f5d1}\\x{fe0f}|\\x{1f5d2}\\x{fe0f}|\\x{1f5d3}\\x{fe0f}|\\x{1f5dc}\\x{fe0f}|\\x{1f5dd}\\x{fe0f}|\\x{1f5de}\\x{fe0f}|\\x{1f5e1}\\x{fe0f}|\\x{1f5e3}\\x{fe0f}|\\x{1f5e8}\\x{fe0f}|\\x{1f5ef}\\x{fe0f}|\\x{1f5f3}\\x{fe0f}|\\x{1f5fa}\\x{fe0f}|\\x{1f645}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f646}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f647}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6a3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6c0}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6cb}\\x{fe0f}|\\x{1f6cc}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6cd}\\x{fe0f}|\\x{1f6ce}\\x{fe0f}|\\x{1f6cf}\\x{fe0f}|\\x{1f6e0}\\x{fe0f}|\\x{1f6e1}\\x{fe0f}|\\x{1f6e2}\\x{fe0f}|\\x{1f6e3}\\x{fe0f}|\\x{1f6e4}\\x{fe0f}|\\x{1f6e5}\\x{fe0f}|\\x{1f6e9}\\x{fe0f}|\\x{1f6f0}\\x{fe0f}|\\x{1f6f3}\\x{fe0f}|\\x{1f90c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f90f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f918}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f919}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f926}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f930}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f931}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f932}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f933}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f934}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f935}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f936}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f937}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f938}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f939}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f93d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f93e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f977}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b8}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b9}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9bb}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9cd}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9ce}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9cf}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d1}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d8}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d9}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9da}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9db}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9dc}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9dd}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf0}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf1}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf8}[\\x{1f3fb}-\\x{1f3ff}]|[\\x{2712}\\x{2714}\\x{2716}\\x{271d}\\x{2721}\\x{2728}\\x{2733}\\x{2734}\\x{2744}\\x{2747}\\x{274c}\\x{274e}\\x{2753}-\\x{2755}\\x{2757}\\x{2763}\\x{2764}\\x{2795}-\\x{2797}\\x{27a1}\\x{27b0}\\x{27bf}\\x{2934}\\x{2935}\\x{2b05}-\\x{2b07}\\x{2b1b}\\x{2b1c}\\x{2b50}\\x{2b55}\\x{3030}\\x{303d}\\x{1f004}\\x{1f0cf}\\x{1f170}\\x{1f171}\\x{1f17e}\\x{1f17f}\\x{1f18e}\\x{1f191}-\\x{1f19a}\\x{1f201}\\x{1f202}\\x{1f21a}\\x{1f22f}\\x{1f232}-\\x{1f23a}\\x{1f250}\\x{1f251}\\x{1f300}-\\x{1f321}\\x{1f324}-\\x{1f393}\\x{1f396}\\x{1f397}\\x{1f399}-\\x{1f39b}\\x{1f39e}-\\x{1f3f0}\\x{1f3f3}-\\x{1f3f5}\\x{1f3f7}-\\x{1f4fd}\\x{1f4ff}-\\x{1f53d}\\x{1f549}-\\x{1f54e}\\x{1f550}-\\x{1f567}\\x{1f56f}\\x{1f570}\\x{1f573}-\\x{1f57a}\\x{1f587}\\x{1f58a}-\\x{1f58d}\\x{1f590}\\x{1f595}\\x{1f596}\\x{1f5a4}\\x{1f5a5}\\x{1f5a8}\\x{1f5b1}\\x{1f5b2}\\x{1f5bc}\\x{1f5c2}-\\x{1f5c4}\\x{1f5d1}-\\x{1f5d3}\\x{1f5dc}-\\x{1f5de}\\x{1f5e1}\\x{1f5e3}\\x{1f5e8}\\x{1f5ef}\\x{1f5f3}\\x{1f5fa}-\\x{1f64f}\\x{1f680}-\\x{1f6c5}\\x{1f6cb}-\\x{1f6d2}\\x{1f6d5}-\\x{1f6d7}\\x{1f6dc}-\\x{1f6e5}\\x{1f6e9}\\x{1f6eb}\\x{1f6ec}\\x{1f6f0}\\x{1f6f3}-\\x{1f6fc}\\x{1f7e0}-\\x{1f7eb}\\x{1f7f0}\\x{1f90c}-\\x{1f93a}\\x{1f93c}-\\x{1f945}\\x{1f947}-\\x{1f9e5}\\x{3297}\\x{1f9e6}-\\x{1f9f9}\\x{3299}\\x{1f9fa}-\\x{1f9ff}\\x{1fa70}-\\x{1fa7c}\\x{1fa80}-\\x{1fa88}\\x{1fa90}-\\x{1fabd}\\x{1fabf}-\\x{1fac5}\\x{1face}-\\x{1fadb}\\x{1fae0}-\\x{1fae8}\\x{1faf0}-\\x{1faf8}\\x{a9}\\x{ae}\\x{203c}\\x{2049}\\x{2122}\\x{2139}\\x{2194}-\\x{2199}\\x{21a9}\\x{21aa}\\x{231a}\\x{231b}\\x{2328}\\x{23cf}\\x{23e9}-\\x{23f3}\\x{23f8}-\\x{23fa}\\x{24c2}\\x{25aa}\\x{25ab}\\x{25b6}\\x{25c0}\\x{25fb}-\\x{25fe}\\x{2600}-\\x{2604}\\x{260e}\\x{2611}\\x{2614}\\x{2615}\\x{2618}\\x{261d}\\x{2620}\\x{2622}\\x{2623}\\x{2626}\\x{262a}\\x{262e}\\x{262f}\\x{2638}-\\x{263a}\\x{2640}\\x{2642}\\x{2648}-\\x{2653}\\x{265f}\\x{2660}\\x{2663}\\x{2665}\\x{2666}\\x{2668}\\x{267b}\\x{267e}\\x{267f}\\x{2692}-\\x{2697}\\x{2699}\\x{269b}\\x{269c}\\x{26a0}\\x{26a1}\\x{26a7}\\x{26aa}\\x{26ab}\\x{26b0}\\x{26b1}\\x{26bd}\\x{26be}\\x{26c4}\\x{26c5}\\x{26c8}\\x{26ce}\\x{26cf}\\x{26d1}\\x{26d3}\\x{26d4}\\x{26e9}\\x{26ea}\\x{26f0}-\\x{26f5}\\x{26f7}-\\x{26fa}\\x{26fd}\\x{2702}\\x{2705}\\x{2708}-\\x{270d}\\x{270f}]|[\\x{fe00}-\\x{fe0f}\\x{200d}]|[#*0-9]\\x{fe0f}\\x{20e3}|[\\x{1f1e6}-\\x{1f1ff}])+$", 66);
            } catch (PatternSyntaxException unused) {
                A07 = Pattern.compile("^[🀄🅰🅱🅾🅿🆎🆒🆔🆕🆗🆙🆚🇧🇨🇩🇪🇪🇫🇬🇮🇯🇰🇳🇵🇷🇷🇷🇸🇸🇹🇺🇺🈁🈂🈚🈯🈳🈵🈶🈷🈸🈹🈺🉐🌀🌂🌃🌄🌅🌆🌇🌈🌊🌙🌟🌴🌵🌷🌸🌹🌺🌻🌾🍀🍁🍂🍃🍅🍆🍉🍊🍎🍓🍔🍘🍙🍚🍛🍜🍝🍞🍟🍡🍢🍣🍦🍧🍰🍱🍲🍳🍴🍵🍶🍸🍺🍻🎀🎁🎂🎃🎄🎅🎆🎇🎈🎉🎌🎍🎎🎏🎐🎑🎒🎓🎡🎢🎤🎥🎦🎧🎨🎩🎫🎬🎯🎰🎱🎵🎶🎷🎸🎺🎾🎿🏀🏁🏃🏄🏆🏈🏊🏠🏢🏣🏥🏦🏧🏨🏩🏪🏫🏬🏭🏯🏰🐍🐎🐑🐒🐔🐗🐘🐙🐚🐛🐟🐠🐤🐦🐧🐨🐫🐬🐭🐮🐯🐰🐱🐳🐴🐵🐶🐷🐸🐹🐺🐻👀👂👃👄👆👇👈👉👊👋👌👍👎👏👐👑👒👔👕👗👘👙👜👟👠👡👢👣👦👧👨👩👫👮👯👱👲👳👴👵👶👷👸👻👼👽👾👿💀💁💂💃💄💅💆💇💈💉💊💋💍💎💏💐💑💒💓💔💗💘💙💚💛💜💝💟💡💢💣💤💦💨💩💪💰💱💱💹💹💺💻💼💽💿📀📖📝📠📡📢📣📩📫📮📱📲📳📴📶📷📺📻📼🔊🔍🔑🔒🔓🔔🔝🔞🔥🔨🔫🔯🔰🔱🔲🔳🔴🕐🕑🕒🕓🕔🕕🕖🕗🕘🕙🕚🕛🗻🗼🗽😁😂😃😄😉😊😌😍😏😒😓😔😖😘😚😜😝😞😠😡😢😣😥😨😪😭😰😱😲😳😷🙅🙆🙇🙌🙏🚀🚃🚄🚅🚇🚉🚌🚏🚑🚒🚓🚕🚗🚙🚚🚢🚤🚥🚧🚬🚭🚲🚶🚹🚺🚻🚼🚽🚾🛀☺✨❕❔✊✌✋☝☀☔☁⛄⚡☕〽♦♣♠⛳⚾⚽➿☎✂⛪⛺⛵⛲♨⚠⛽⃣⃣⃣⃣⃣⃣⃣⬅⬇⬆⃣⃣⃣⃣➡↗↖↘↙◀▶⏪⏩♿✳㊗㊙✴♈♉♊♋♌♍♎⛎♓♒♑♐♏❌⭕]+$", 66);
            }
        }
        if (A07.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    public static boolean A0B(String str) {
        if (TextUtils.isEmpty(str) || str.codePointCount(0, str.length() - 1) > 10) {
            return false;
        }
        if (A07 == null) {
            try {
                A07 = Pattern.compile("^(\\x{23}\\x{20e3}|\\x{2a}\\x{20e3}|\\x{30}\\x{20e3}|\\x{31}\\x{20e3}|\\x{32}\\x{20e3}|\\x{33}\\x{20e3}|\\x{34}\\x{20e3}|\\x{35}\\x{20e3}|\\x{36}\\x{20e3}|\\x{37}\\x{20e3}|\\x{38}\\x{20e3}|\\x{39}\\x{20e3}|\\x{a9}\\x{fe0f}|\\x{ae}\\x{fe0f}|\\x{203c}\\x{fe0f}|\\x{2049}\\x{fe0f}|\\x{2122}\\x{fe0f}|\\x{2139}\\x{fe0f}|\\x{2194}\\x{fe0f}|\\x{2195}\\x{fe0f}|\\x{2196}\\x{fe0f}|\\x{2197}\\x{fe0f}|\\x{2198}\\x{fe0f}|\\x{2199}\\x{fe0f}|\\x{21a9}\\x{fe0f}|\\x{21aa}\\x{fe0f}|\\x{2328}\\x{fe0f}|\\x{23cf}\\x{fe0f}|\\x{23ed}\\x{fe0f}|\\x{23ee}\\x{fe0f}|\\x{23ef}\\x{fe0f}|\\x{23f1}\\x{fe0f}|\\x{23f2}\\x{fe0f}|\\x{23f8}\\x{fe0f}|\\x{23f9}\\x{fe0f}|\\x{23fa}\\x{fe0f}|\\x{24c2}\\x{fe0f}|\\x{25aa}\\x{fe0f}|\\x{25ab}\\x{fe0f}|\\x{25b6}\\x{fe0f}|\\x{25c0}\\x{fe0f}|\\x{25fb}\\x{fe0f}|\\x{25fc}\\x{fe0f}|\\x{2600}\\x{fe0f}|\\x{2601}\\x{fe0f}|\\x{2602}\\x{fe0f}|\\x{2603}\\x{fe0f}|\\x{2604}\\x{fe0f}|\\x{260e}\\x{fe0f}|\\x{2611}\\x{fe0f}|\\x{2618}\\x{fe0f}|\\x{261d}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{2620}\\x{fe0f}|\\x{2622}\\x{fe0f}|\\x{2623}\\x{fe0f}|\\x{2626}\\x{fe0f}|\\x{262a}\\x{fe0f}|\\x{262e}\\x{fe0f}|\\x{262f}\\x{fe0f}|\\x{2638}\\x{fe0f}|\\x{2639}\\x{fe0f}|\\x{263a}\\x{fe0f}|\\x{2640}\\x{fe0f}|\\x{2642}\\x{fe0f}|\\x{265f}\\x{fe0f}|\\x{2660}\\x{fe0f}|\\x{2663}\\x{fe0f}|\\x{2665}\\x{fe0f}|\\x{2666}\\x{fe0f}|\\x{2668}\\x{fe0f}|\\x{267b}\\x{fe0f}|\\x{267e}\\x{fe0f}|\\x{2692}\\x{fe0f}|\\x{2694}\\x{fe0f}|\\x{2695}\\x{fe0f}|\\x{2696}\\x{fe0f}|\\x{2697}\\x{fe0f}|\\x{2699}\\x{fe0f}|\\x{269b}\\x{fe0f}|\\x{269c}\\x{fe0f}|\\x{26a0}\\x{fe0f}|\\x{26a7}\\x{fe0f}|\\x{26b0}\\x{fe0f}|\\x{26b1}\\x{fe0f}|\\x{26c8}\\x{fe0f}|\\x{26cf}\\x{fe0f}|\\x{26d1}\\x{fe0f}|\\x{26d3}\\x{fe0f}|\\x{26e9}\\x{fe0f}|\\x{26f0}\\x{fe0f}|\\x{26f1}\\x{fe0f}|\\x{26f4}\\x{fe0f}|\\x{26f7}\\x{fe0f}|\\x{26f8}\\x{fe0f}|\\x{26f9}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{2702}\\x{fe0f}|\\x{2708}\\x{fe0f}|\\x{2709}\\x{fe0f}|\\x{270a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{270b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{270c}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{270d}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{270f}\\x{fe0f}|\\x{2712}\\x{fe0f}|\\x{2714}\\x{fe0f}|\\x{2716}\\x{fe0f}|\\x{271d}\\x{fe0f}|\\x{2721}\\x{fe0f}|\\x{2733}\\x{fe0f}|\\x{2734}\\x{fe0f}|\\x{2744}\\x{fe0f}|\\x{2747}\\x{fe0f}|\\x{2763}\\x{fe0f}|\\x{2764}\\x{fe0f}|\\x{27a1}\\x{fe0f}|\\x{2934}\\x{fe0f}|\\x{2935}\\x{fe0f}|\\x{2b05}\\x{fe0f}|\\x{2b06}\\x{fe0f}|\\x{2b07}\\x{fe0f}|\\x{3030}\\x{fe0f}|\\x{303d}\\x{fe0f}|\\x{3297}\\x{fe0f}|\\x{3299}\\x{fe0f}|\\x{1f170}\\x{fe0f}|\\x{1f171}\\x{fe0f}|\\x{1f17e}\\x{fe0f}|\\x{1f17f}\\x{fe0f}|\\x{1f1e6}[\\x{1f1e8}-\\x{1f1ec}\\x{1f1ee}\\x{1f1f1}\\x{1f1f2}\\x{1f1f4}\\x{1f1f6}-\\x{1f1fa}\\x{1f1fc}\\x{1f1fd}\\x{1f1ff}]|\\x{1f1e7}[\\x{1f1e6}\\x{1f1e7}\\x{1f1e9}-\\x{1f1ef}\\x{1f1f1}-\\x{1f1f4}\\x{1f1f6}-\\x{1f1f9}\\x{1f1fb}\\x{1f1fc}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1e8}[\\x{1f1e6}\\x{1f1e8}\\x{1f1e9}\\x{1f1eb}-\\x{1f1ee}\\x{1f1f0}-\\x{1f1f5}\\x{1f1f7}\\x{1f1fa}-\\x{1f1ff}]|\\x{1f1e9}[\\x{1f1ea}\\x{1f1ec}\\x{1f1ef}\\x{1f1f0}\\x{1f1f2}\\x{1f1f4}\\x{1f1ff}]|\\x{1f1ea}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}\\x{1f1ec}\\x{1f1ed}\\x{1f1f7}-\\x{1f1fa}]|\\x{1f1eb}[\\x{1f1ee}-\\x{1f1f0}\\x{1f1f2}\\x{1f1f4}\\x{1f1f7}]|\\x{1f1ec}[\\x{1f1e6}\\x{1f1e7}\\x{1f1e9}-\\x{1f1ee}\\x{1f1f1}-\\x{1f1f3}\\x{1f1f5}-\\x{1f1fa}\\x{1f1fc}\\x{1f1fe}]|\\x{1f1ed}[\\x{1f1f0}\\x{1f1f2}\\x{1f1f3}\\x{1f1f7}\\x{1f1f9}\\x{1f1fa}]|\\x{1f1ee}[\\x{1f1e8}-\\x{1f1ea}\\x{1f1f1}-\\x{1f1f4}\\x{1f1f6}-\\x{1f1f9}]|\\x{1f1ef}[\\x{1f1ea}\\x{1f1f2}\\x{1f1f4}\\x{1f1f5}]|\\x{1f1f0}[\\x{1f1ea}\\x{1f1ec}-\\x{1f1ee}\\x{1f1f2}\\x{1f1f3}\\x{1f1f5}\\x{1f1f7}\\x{1f1fc}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1f1}[\\x{1f1e6}-\\x{1f1e8}\\x{1f1ee}\\x{1f1f0}\\x{1f1f7}-\\x{1f1fb}\\x{1f1fe}]|\\x{1f1f2}[\\x{1f1e6}\\x{1f1e8}-\\x{1f1ed}\\x{1f1f0}-\\x{1f1ff}]|\\x{1f1f3}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}-\\x{1f1ec}\\x{1f1ee}\\x{1f1f1}\\x{1f1f4}\\x{1f1f5}\\x{1f1f7}\\x{1f1fa}\\x{1f1ff}]|\\x{1f1f4}\\x{1f1f2}|\\x{1f1f5}[\\x{1f1e6}\\x{1f1ea}-\\x{1f1ed}\\x{1f1f0}-\\x{1f1f3}\\x{1f1f7}-\\x{1f1f9}\\x{1f1fc}\\x{1f1fe}]|\\x{1f1f6}\\x{1f1e6}|\\x{1f1f7}[\\x{1f1ea}\\x{1f1f4}\\x{1f1f8}\\x{1f1fa}\\x{1f1fc}]|\\x{1f1f8}[\\x{1f1e6}-\\x{1f1ea}\\x{1f1ec}-\\x{1f1f4}\\x{1f1f7}-\\x{1f1f9}\\x{1f1fb}\\x{1f1fd}-\\x{1f1ff}]|\\x{1f1f9}[\\x{1f1e6}\\x{1f1e8}\\x{1f1e9}\\x{1f1eb}-\\x{1f1ed}\\x{1f1ef}-\\x{1f1f4}\\x{1f1f7}\\x{1f1f9}\\x{1f1fb}\\x{1f1fc}\\x{1f1ff}]|\\x{1f1fa}[\\x{1f1e6}\\x{1f1ec}\\x{1f1f2}\\x{1f1f3}\\x{1f1f8}\\x{1f1fe}\\x{1f1ff}]|\\x{1f1fb}[\\x{1f1e6}\\x{1f1e8}\\x{1f1ea}\\x{1f1ec}\\x{1f1ee}\\x{1f1f3}\\x{1f1fa}]|\\x{1f1fc}[\\x{1f1eb}\\x{1f1f8}]|\\x{1f1fd}\\x{1f1f0}|\\x{1f1fe}[\\x{1f1ea}\\x{1f1f9}]|\\x{1f1ff}[\\x{1f1e6}\\x{1f1f2}\\x{1f1fc}]|\\x{1f202}\\x{fe0f}|\\x{1f237}\\x{fe0f}|\\x{1f321}\\x{fe0f}|\\x{1f324}\\x{fe0f}|\\x{1f325}\\x{fe0f}|\\x{1f326}\\x{fe0f}|\\x{1f327}\\x{fe0f}|\\x{1f328}\\x{fe0f}|\\x{1f329}\\x{fe0f}|\\x{1f32a}\\x{fe0f}|\\x{1f32b}\\x{fe0f}|\\x{1f32c}\\x{fe0f}|\\x{1f336}\\x{fe0f}|\\x{1f37d}\\x{fe0f}|\\x{1f385}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f396}\\x{fe0f}|\\x{1f397}\\x{fe0f}|\\x{1f399}\\x{fe0f}|\\x{1f39a}\\x{fe0f}|\\x{1f39b}\\x{fe0f}|\\x{1f39e}\\x{fe0f}|\\x{1f39f}\\x{fe0f}|\\x{1f3c2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3c7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3ca}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f3cb}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f3cc}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f3cd}\\x{fe0f}|\\x{1f3ce}\\x{fe0f}|\\x{1f3d4}\\x{fe0f}|\\x{1f3d5}\\x{fe0f}|\\x{1f3d6}\\x{fe0f}|\\x{1f3d7}\\x{fe0f}|\\x{1f3d8}\\x{fe0f}|\\x{1f3d9}\\x{fe0f}|\\x{1f3da}\\x{fe0f}|\\x{1f3db}\\x{fe0f}|\\x{1f3dc}\\x{fe0f}|\\x{1f3dd}\\x{fe0f}|\\x{1f3de}\\x{fe0f}|\\x{1f3df}\\x{fe0f}|\\x{1f3f3}\\x{fe0f}|\\x{1f3f5}\\x{fe0f}|\\x{1f3f7}\\x{fe0f}|\\x{1f43f}\\x{fe0f}|\\x{1f441}\\x{fe0f}|\\x{1f442}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f443}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f446}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f447}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f448}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f449}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f44f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f450}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f466}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f467}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f468}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f469}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f46e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f470}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f471}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f472}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f473}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f474}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f475}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f476}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f477}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f478}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f47c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f481}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f482}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f483}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f485}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f486}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f487}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f48f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f491}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f4aa}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f4fd}\\x{fe0f}|\\x{1f549}\\x{fe0f}|\\x{1f54a}\\x{fe0f}|\\x{1f56f}\\x{fe0f}|\\x{1f570}\\x{fe0f}|\\x{1f573}\\x{fe0f}|\\x{1f574}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f575}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f576}\\x{fe0f}|\\x{1f577}\\x{fe0f}|\\x{1f578}\\x{fe0f}|\\x{1f579}\\x{fe0f}|\\x{1f57a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f587}\\x{fe0f}|\\x{1f58a}\\x{fe0f}|\\x{1f58b}\\x{fe0f}|\\x{1f58c}\\x{fe0f}|\\x{1f58d}\\x{fe0f}|\\x{1f590}[\\x{1f3fb}-\\x{1f3ff}\\x{fe0f}]|\\x{1f595}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f596}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f5a5}\\x{fe0f}|\\x{1f5a8}\\x{fe0f}|\\x{1f5b1}\\x{fe0f}|\\x{1f5b2}\\x{fe0f}|\\x{1f5bc}\\x{fe0f}|\\x{1f5c2}\\x{fe0f}|\\x{1f5c3}\\x{fe0f}|\\x{1f5c4}\\x{fe0f}|\\x{1f5d1}\\x{fe0f}|\\x{1f5d2}\\x{fe0f}|\\x{1f5d3}\\x{fe0f}|\\x{1f5dc}\\x{fe0f}|\\x{1f5dd}\\x{fe0f}|\\x{1f5de}\\x{fe0f}|\\x{1f5e1}\\x{fe0f}|\\x{1f5e3}\\x{fe0f}|\\x{1f5e8}\\x{fe0f}|\\x{1f5ef}\\x{fe0f}|\\x{1f5f3}\\x{fe0f}|\\x{1f5fa}\\x{fe0f}|\\x{1f645}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f646}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f647}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f64f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6a3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6b6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6c0}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6cb}\\x{fe0f}|\\x{1f6cc}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f6cd}\\x{fe0f}|\\x{1f6ce}\\x{fe0f}|\\x{1f6cf}\\x{fe0f}|\\x{1f6e0}\\x{fe0f}|\\x{1f6e1}\\x{fe0f}|\\x{1f6e2}\\x{fe0f}|\\x{1f6e3}\\x{fe0f}|\\x{1f6e4}\\x{fe0f}|\\x{1f6e5}\\x{fe0f}|\\x{1f6e9}\\x{fe0f}|\\x{1f6f0}\\x{fe0f}|\\x{1f6f3}\\x{fe0f}|\\x{1f90c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f90f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f918}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f919}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91a}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91b}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91c}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f91f}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f926}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f930}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f931}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f932}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f933}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f934}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f935}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f936}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f937}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f938}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f939}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f93d}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f93e}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f977}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b8}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9b9}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9bb}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9cd}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9ce}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9cf}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d1}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d8}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9d9}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9da}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9db}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9dc}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1f9dd}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1fac5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf0}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf1}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf2}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf3}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf4}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf5}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf6}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf7}[\\x{1f3fb}-\\x{1f3ff}]|\\x{1faf8}[\\x{1f3fb}-\\x{1f3ff}]|[\\x{2712}\\x{2714}\\x{2716}\\x{271d}\\x{2721}\\x{2728}\\x{2733}\\x{2734}\\x{2744}\\x{2747}\\x{274c}\\x{274e}\\x{2753}-\\x{2755}\\x{2757}\\x{2763}\\x{2764}\\x{2795}-\\x{2797}\\x{27a1}\\x{27b0}\\x{27bf}\\x{2934}\\x{2935}\\x{2b05}-\\x{2b07}\\x{2b1b}\\x{2b1c}\\x{2b50}\\x{2b55}\\x{3030}\\x{303d}\\x{1f004}\\x{1f0cf}\\x{1f170}\\x{1f171}\\x{1f17e}\\x{1f17f}\\x{1f18e}\\x{1f191}-\\x{1f19a}\\x{1f201}\\x{1f202}\\x{1f21a}\\x{1f22f}\\x{1f232}-\\x{1f23a}\\x{1f250}\\x{1f251}\\x{1f300}-\\x{1f321}\\x{1f324}-\\x{1f393}\\x{1f396}\\x{1f397}\\x{1f399}-\\x{1f39b}\\x{1f39e}-\\x{1f3f0}\\x{1f3f3}-\\x{1f3f5}\\x{1f3f7}-\\x{1f4fd}\\x{1f4ff}-\\x{1f53d}\\x{1f549}-\\x{1f54e}\\x{1f550}-\\x{1f567}\\x{1f56f}\\x{1f570}\\x{1f573}-\\x{1f57a}\\x{1f587}\\x{1f58a}-\\x{1f58d}\\x{1f590}\\x{1f595}\\x{1f596}\\x{1f5a4}\\x{1f5a5}\\x{1f5a8}\\x{1f5b1}\\x{1f5b2}\\x{1f5bc}\\x{1f5c2}-\\x{1f5c4}\\x{1f5d1}-\\x{1f5d3}\\x{1f5dc}-\\x{1f5de}\\x{1f5e1}\\x{1f5e3}\\x{1f5e8}\\x{1f5ef}\\x{1f5f3}\\x{1f5fa}-\\x{1f64f}\\x{1f680}-\\x{1f6c5}\\x{1f6cb}-\\x{1f6d2}\\x{1f6d5}-\\x{1f6d7}\\x{1f6dc}-\\x{1f6e5}\\x{1f6e9}\\x{1f6eb}\\x{1f6ec}\\x{1f6f0}\\x{1f6f3}-\\x{1f6fc}\\x{1f7e0}-\\x{1f7eb}\\x{1f7f0}\\x{1f90c}-\\x{1f93a}\\x{1f93c}-\\x{1f945}\\x{1f947}-\\x{1f9e5}\\x{3297}\\x{1f9e6}-\\x{1f9f9}\\x{3299}\\x{1f9fa}-\\x{1f9ff}\\x{1fa70}-\\x{1fa7c}\\x{1fa80}-\\x{1fa88}\\x{1fa90}-\\x{1fabd}\\x{1fabf}-\\x{1fac5}\\x{1face}-\\x{1fadb}\\x{1fae0}-\\x{1fae8}\\x{1faf0}-\\x{1faf8}\\x{a9}\\x{ae}\\x{203c}\\x{2049}\\x{2122}\\x{2139}\\x{2194}-\\x{2199}\\x{21a9}\\x{21aa}\\x{231a}\\x{231b}\\x{2328}\\x{23cf}\\x{23e9}-\\x{23f3}\\x{23f8}-\\x{23fa}\\x{24c2}\\x{25aa}\\x{25ab}\\x{25b6}\\x{25c0}\\x{25fb}-\\x{25fe}\\x{2600}-\\x{2604}\\x{260e}\\x{2611}\\x{2614}\\x{2615}\\x{2618}\\x{261d}\\x{2620}\\x{2622}\\x{2623}\\x{2626}\\x{262a}\\x{262e}\\x{262f}\\x{2638}-\\x{263a}\\x{2640}\\x{2642}\\x{2648}-\\x{2653}\\x{265f}\\x{2660}\\x{2663}\\x{2665}\\x{2666}\\x{2668}\\x{267b}\\x{267e}\\x{267f}\\x{2692}-\\x{2697}\\x{2699}\\x{269b}\\x{269c}\\x{26a0}\\x{26a1}\\x{26a7}\\x{26aa}\\x{26ab}\\x{26b0}\\x{26b1}\\x{26bd}\\x{26be}\\x{26c4}\\x{26c5}\\x{26c8}\\x{26ce}\\x{26cf}\\x{26d1}\\x{26d3}\\x{26d4}\\x{26e9}\\x{26ea}\\x{26f0}-\\x{26f5}\\x{26f7}-\\x{26fa}\\x{26fd}\\x{2702}\\x{2705}\\x{2708}-\\x{270d}\\x{270f}]|[\\x{fe00}-\\x{fe0f}\\x{200d}]|[#*0-9]\\x{fe0f}\\x{20e3}|[\\x{1f1e6}-\\x{1f1ff}])+$", 66);
            } catch (PatternSyntaxException unused) {
                A07 = Pattern.compile("^[🀄🅰🅱🅾🅿🆎🆒🆔🆕🆗🆙🆚🇧🇨🇩🇪🇪🇫🇬🇮🇯🇰🇳🇵🇷🇷🇷🇸🇸🇹🇺🇺🈁🈂🈚🈯🈳🈵🈶🈷🈸🈹🈺🉐🌀🌂🌃🌄🌅🌆🌇🌈🌊🌙🌟🌴🌵🌷🌸🌹🌺🌻🌾🍀🍁🍂🍃🍅🍆🍉🍊🍎🍓🍔🍘🍙🍚🍛🍜🍝🍞🍟🍡🍢🍣🍦🍧🍰🍱🍲🍳🍴🍵🍶🍸🍺🍻🎀🎁🎂🎃🎄🎅🎆🎇🎈🎉🎌🎍🎎🎏🎐🎑🎒🎓🎡🎢🎤🎥🎦🎧🎨🎩🎫🎬🎯🎰🎱🎵🎶🎷🎸🎺🎾🎿🏀🏁🏃🏄🏆🏈🏊🏠🏢🏣🏥🏦🏧🏨🏩🏪🏫🏬🏭🏯🏰🐍🐎🐑🐒🐔🐗🐘🐙🐚🐛🐟🐠🐤🐦🐧🐨🐫🐬🐭🐮🐯🐰🐱🐳🐴🐵🐶🐷🐸🐹🐺🐻👀👂👃👄👆👇👈👉👊👋👌👍👎👏👐👑👒👔👕👗👘👙👜👟👠👡👢👣👦👧👨👩👫👮👯👱👲👳👴👵👶👷👸👻👼👽👾👿💀💁💂💃💄💅💆💇💈💉💊💋💍💎💏💐💑💒💓💔💗💘💙💚💛💜💝💟💡💢💣💤💦💨💩💪💰💱💱💹💹💺💻💼💽💿📀📖📝📠📡📢📣📩📫📮📱📲📳📴📶📷📺📻📼🔊🔍🔑🔒🔓🔔🔝🔞🔥🔨🔫🔯🔰🔱🔲🔳🔴🕐🕑🕒🕓🕔🕕🕖🕗🕘🕙🕚🕛🗻🗼🗽😁😂😃😄😉😊😌😍😏😒😓😔😖😘😚😜😝😞😠😡😢😣😥😨😪😭😰😱😲😳😷🙅🙆🙇🙌🙏🚀🚃🚄🚅🚇🚉🚌🚏🚑🚒🚓🚕🚗🚙🚚🚢🚤🚥🚧🚬🚭🚲🚶🚹🚺🚻🚼🚽🚾🛀☺✨❕❔✊✌✋☝☀☔☁⛄⚡☕〽♦♣♠⛳⚾⚽➿☎✂⛪⛺⛵⛲♨⚠⛽⃣⃣⃣⃣⃣⃣⃣⬅⬇⬆⃣⃣⃣⃣➡↗↖↘↙◀▶⏪⏩♿✳㊗㊙✴♈♉♊♋♌♍♎⛎♓♒♑♐♏❌⭕]+$", 66);
            }
        }
        return A07.matcher(str).matches();
    }
}
