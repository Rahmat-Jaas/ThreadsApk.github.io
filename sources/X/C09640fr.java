package X;

import android.opengl.GLES20;

/* renamed from: X.0fr  reason: invalid class name and case insensitive filesystem */
public final class C09640fr {
    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A01(AnonymousClass00U.A0J("glCreateShader type=", i));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        AnonymousClass0LU.A0N("GLProgramUtil", "Could not compile shader %d:", Integer.valueOf(i));
        AnonymousClass0LU.A0N("GLProgramUtil", " %s", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            AnonymousClass0LU.A0N("GLProgramUtil", "%s: glError %d", str, Integer.valueOf(glGetError));
            throw new RuntimeException(AnonymousClass00U.A0R(str, ": glError ", glGetError));
        }
    }
}
