package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;

/* renamed from: X.0sC  reason: invalid class name and case insensitive filesystem */
public final class C15930sC {
    public static String A00(int i) {
        if (i == 1) {
            return "UNIFIED_INBOX_INSTAGRAM_DIRECT_THREAD_LIST_FULL_FETCH";
        }
        if (i == 2) {
            return "UNIFIED_INBOX_INSTAGRAM_DIRECT_MESSAGE_LIST_FULL_FETCH";
        }
        if (i == 3) {
            return "UNIFIED_INBOX_MESSENGER_THREAD_LIST_FULL_FETCH";
        }
        if (i == 4) {
            return "UNIFIED_INBOX_MESSENGER_MESSAGE_LIST_FULL_FETCH";
        }
        if (i == 17) {
            return "UNIFIED_INBOX_COMMS_CONFIG_FETCH";
        }
        if (i == 18) {
            return "UNIFIED_INBOX_UNIFIED_THREAD_LIST_FULL_FETCH";
        }
        switch (i) {
            case 20:
                return "UNIFIED_INBOX_INBOX_TAB_TTRC";
            case 21:
                return "UNIFIED_INBOX_UNIFIED_THREADS_TAB_TTRC";
            case 22:
                return "UNIFIED_INBOX_MESSENGER_TAB_TTRC";
            case 23:
                return "UNIFIED_INBOX_FACEBOOK_COMMENTS_TAB_TTRC";
            case 24:
                return "UNIFIED_INBOX_INSTAGRAM_COMMENTS_TAB_TTRC";
            case 25:
                return "UNIFIED_INBOX_INSTAGRAM_DIRECT_TAB_TTRC";
            case Rfc3492Idn.tmax /*26*/:
                return "UNIFIED_INBOX_UNIFIED_COMMENTS_TAB_TTRC";
            default:
                switch (i) {
                    case 1024:
                        return "UNIFIED_INBOX_WEC_THREAD_LIST_FULL_FETCH";
                    case 1296:
                        return "UNIFIED_INBOX_MSYS_THREAD_LIST_FETCH";
                    case 2621:
                        return "UNIFIED_INBOX_WEC_MESSAGE_LIST_FULL_FETCH";
                    case 2809:
                        return "UNIFIED_INBOX_THREAD_LIST_TTRC";
                    case 3836:
                        return "UNIFIED_INBOX_WHATSAPP_CONFIG_LOAD";
                    case 4899:
                        return "UNIFIED_INBOX_INSTAGRAM_POST_FULL_FETCH";
                    case 5647:
                        return "UNIFIED_INBOX_WHATSAPP_THREAD_LIST_LOAD";
                    case 5984:
                        return "UNIFIED_INBOX_INSTAGRAM_THREAD_LIST_LOAD";
                    case 6400:
                        return "UNIFIED_INBOX_UNIFIED_THREAD_LIST";
                    case 7309:
                        return "UNIFIED_INBOX_MESSENGER_MESSAGE_LIST_LOAD";
                    case 8301:
                        return "UNIFIED_INBOX_INSTAGRAM_DIRECT_IRIS_MESSAGE";
                    case 8963:
                        return "UNIFIED_INBOX_BIZ_AUTOMATION_EDITOR_TTRC";
                    case 9099:
                        return "UNIFIED_INBOX_MESSAGE_LIST_TTRC";
                    case 9431:
                        return "UNIFIED_INBOX_WHATSAPP_MESSAGE_LIST_LOAD";
                    case 9757:
                        return "UNIFIED_INBOX_MESSENGER_THREAD_LIST_LOAD";
                    case 15305:
                        return "UNIFIED_INBOX_UNIFIED_SEND_MESSAGE";
                    case 15760:
                        return "UNIFIED_INBOX_INSTAGRAM_MESSAGE_LIST_LOAD";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
