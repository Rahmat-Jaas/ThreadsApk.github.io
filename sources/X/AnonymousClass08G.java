package X;

import java.io.PrintWriter;

/* renamed from: X.08G  reason: invalid class name */
public final class AnonymousClass08G {
    public static void A00(PrintWriter printWriter, Thread thread, StackTraceElement[] stackTraceElementArr) {
        printWriter.print(thread);
        printWriter.print(" ");
        printWriter.print(thread.getState());
        printWriter.println(":");
        for (StackTraceElement println : stackTraceElementArr) {
            printWriter.println(println);
        }
        printWriter.println();
    }
}
