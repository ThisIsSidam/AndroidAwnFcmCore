package me.carda.awesome_notifications_fcm.core;

public interface FcmDefinitions {

    String DART_REVERSE_CHANNEL = "AWFcmReverse";
    String CHANNEL_FLUTTER_PLUGIN = "awesome_notifications_fcm";

    String BROADCAST_FCM_TOKEN = "me.carda.awesome_notifications_fcm.core.services.firebase.TOKEN";
    String BROADCAST_SILENT_DATA = "me.carda.awesome_notifications_fcm.core.services.silentData";

    String SHARED_FCM_DEFAULTS = "fcmDefaults";

    String FIREBASE_EVENTS_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";

    String RPC_DISMISS = "dismiss";
    String RPC_DISMISS_BY_CHANNEL = "dismissByChannel";
    String RPC_DISMISS_BY_GROUP = "dismissByGroup";
    String RPC_DISMISS_ALL = "dismissAll";

    String RPC_CANCEL_SCHEDULE = "cancelSchedule";
    String RPC_CANCEL_SCHEDULE_BY_CHANNEL = "cancelScheduleByChannel";
    String RPC_CANCEL_SCHEDULE_BY_GROUP = "cancelScheduleByGroup";
    String RPC_CANCEL_ALL_SCHEDULES = "cancelAllSchedules";

    String RPC_CANCEL_NOTIFICATION = "cancelNotification";
    String RPC_CANCEL_NOTIFICATION_BY_CHANNEL = "cancelNotificationByChannel";
    String RPC_CANCEL_NOTIFICATION_BY_GROUP = "cancelNotificationByGroup";
    String RPC_CANCEL_ALL_NOTIFICATIONS = "cancelAllNotifications";

    String RPC_STOP = "dontCallFlutter";

    String FIREBASE_FLAG_IS_SILENT_DATA = "isSilentData";
    String FIREBASE_TITLE = "fcm.title";
    String FIREBASE_BODY = "fcm.body";
    String FIREBASE_IMAGE = "fcm.image";
    String FIREBASE_CHANNEL_ID = "fcm.android_channel_id";
    String FIREBASE_ORIGINAL_EXTRAS = "fcm.original_extras";
    String FIREBASE_ENABLED = "FIREBASE_ENABLED";

    String EXTRA_BROADCAST_FCM_TOKEN = "token";
    String EXTRA_SILENT_DATA = "silentData";

    String DEBUG_MODE = "debug";
    String LICENSE_KEYS = "licenseKeys";
    String SILENT_HANDLE = "fcmSilentHandle";
    String DART_BG_HANDLE = "fcmDartBGHandle";

    String NOTIFICATION_TOPIC = "topic";

    String REMAINING_SILENT_DATA = "remainingSilentData";
    String NOTIFICATION_SILENT_DATA = "notificationSilentData";
    String CHANNEL_METHOD_INITIALIZE = "initialize";
    String CHANNEL_METHOD_SILENT_CALLBACK = "silentCallbackReference";
    String CHANNEL_METHOD_PUSH_NEXT_DATA = "pushNext";
    String CHANNEL_METHOD_GET_FCM_TOKEN = "getFirebaseToken";
    String CHANNEL_METHOD_NEW_FCM_TOKEN = "newFcmToken";
    String CHANNEL_METHOD_NEW_NATIVE_TOKEN = "newNativeToken";
    String CHANNEL_METHOD_IS_FCM_AVAILABLE = "isFirebaseAvailable";
    String CHANNEL_METHOD_SUBSCRIBE_TOPIC = "subscribeTopic";
    String CHANNEL_METHOD_UNSUBSCRIBE_TOPIC = "unsubscribeTopic";
    String CHANNEL_METHOD_DELETE_TOKEN = "deleteToken";
    String CHANNEL_METHOD_SILENCED_CALLBACK = "silentCallbackReference";
    String CHANNEL_METHOD_SEND_PUSH = "sendPush";
    String CHANNEL_METHOD_DART_CALLBACK = "dartCallbackReference";
    String CHANNEL_METHOD_SHUTDOWN_DART = "shutdown";
    String CHANNEL_METHOD_SEND_PUSH_TOKEN = "sendPushToken";
    String CHANNEL_METHOD_SEND_PUSH_TOPIC = "sendPushTopic";
    String CHANNEL_METHOD_SEND_PUSH_CONDITION = "sendPushCondition";

    String NOTIFICATION_MODEL_ANDROID = "Android";
    String NOTIFICATION_MODEL_IOS = "iOS";

    String NOTIFICATION_FCM_OPTIONS = "fcmOptions";
    String NOTIFICATION_FCM_DRY_RUN = "driRun";
    String NOTIFICATION_OPTION_APNS = "apns";
    String NOTIFICATION_OPTION_ANDROID = "android";
    String NOTIFICATION_OPTION_WEB = "webPush";
    String NOTIFICATION_OPTION_PRIORITY = "priority";

    String NOTIFICATION_FCM_DATA = "data";
    String CLIENT_EMAIL = "clientEmail";
    String PRIVATE_KEY = "privateKey";
}
