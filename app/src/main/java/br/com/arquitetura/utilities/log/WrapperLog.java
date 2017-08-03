package br.com.arquitetura.utilities.log;

import android.util.Log;

/**
 * @author enzo.teles
 * */
public final class WrapperLog {

	public static final boolean LOG_ENABLE = true;

	public static final String LOG_TAG = "Night";

	private WrapperLog() {
		super();
	}

	/**
	 * Method log the msg received
	 *
	 * @param msg
	 */
	public static void info(final String msg) {

		if (LOG_ENABLE) {

			Log.i(LOG_TAG, msg);
		}
	}

	public static void debug(final String msg) {

		if (LOG_ENABLE) {
			Log.d(LOG_TAG, msg);
		}
	}

	public static void verbose(final String msg) {

		if (LOG_ENABLE) {
			Log.v(LOG_TAG, msg);
		}
	}

	public static void error(final String msg) {

		if (LOG_ENABLE) {
			Log.e(LOG_TAG, msg);
		}
	}

	public static void warn(final String msg) {

		if (LOG_ENABLE) {
			Log.w(LOG_TAG, msg);
		}
	}
}
