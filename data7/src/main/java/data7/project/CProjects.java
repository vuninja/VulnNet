package data7.project;
 /*-
 * #%L
 * Data
7 * %%
 * Copyright (C) 2018 University of Luxembourg, Matthieu Jimenez
 * %% 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */



import java.util.TreeMap;

public class CProjects {

	public static final Project CONTROL_PANEL = new Project(
		"control_panel",
		"https://github.com/serghey-rodin/vesta/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/serghey-rodin/vesta/issues",
		".*?(github\\.com\\/serghey-rodin\\/vesta\\/issues\\/)([0-9]+)",
		2,
		"PHP;Smarty;Shell;HTML;JavaScript;CSS;C++;C;CoffeeScript;Hack"
	);

	public static final Project SELINUX = new Project(
		"selinux",
		"https://github.com/SELinuxProject/selinux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/SELinuxProject/selinux/issues",
		".*?(github\\.com\\/SELinuxProject\\/selinux\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Roff;Objective-C;Makefile;Yacc;Shell;C++;Lex"
	);

	public static final Project THREAT_DISCOVERY_APPLIANCE = new Project(
		"threat_discovery_appliance",
		"https://github.com/rapid7/metasploit-framework/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/rapid7/metasploit-framework/issues",
		".*?(github\\.com\\/rapid7\\/metasploit-framework\\/issues\\/)([0-9]+)",
		2,
		"Ruby;C;Python;JavaScript;HTML;PowerShell;Assembly;RichTextFormat;Go;Shell;Objective-C;CSS;PostScript;Dockerfile;C++;VisualBasic;PHP;Batchfile;AngelScript;Makefile;DIGITALCommandLanguage"
	);

	public static final Project RSYSLOG = new Project(
		"rsyslog",
		"https://github.com/rsyslog/rsyslog/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/rsyslog/rsyslog/issues",
		".*?(github\\.com\\/rsyslog\\/rsyslog\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;JavaScript;Makefile;C++;M4;Python;Roff;Lex;Yacc;Perl;TSQL;Java;Tcl;Ruby"
	);

	public static final Project RSYSLOG_1 = new Project(
		"rsyslog",
		"https://github.com/golang/go/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/golang/go/issues",
		".*?(github\\.com\\/golang\\/go\\/issues\\/)([0-9]+)",
		2,
		"Go;HTML;Assembly;C;Shell;Perl;JavaScript;Python;Batchfile;C++;Makefile;Awk;Fortran"
	);

	public static final Project VARNISH = new Project(
		"varnish",
		"https://github.com/varnishcache/varnish-cache/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/varnishcache/varnish-cache/issues",
		".*?(github\\.com\\/varnishcache\\/varnish-cache\\/issues\\/)([0-9]+)",
		2,
		"C;C++;M4;Python;Makefile;Objective-C;Shell;VCL;Roff;Awk;EmacsLisp"
	);

	public static final Project VARNISH_1 = new Project(
		"varnish",
		"https://github.com/varnish/Varnish-Cache/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/varnish/Varnish-Cache/issues",
		".*?(github\\.com\\/varnish\\/Varnish-Cache\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Makefile;Perl;Shell;Groff"
	);

	public static final Project PROXYCHAINS_NG = new Project(
		"proxychains-ng",
		"https://github.com/rofl0r/proxychains-ng/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/rofl0r/proxychains-ng/issues",
		".*?(github\\.com\\/rofl0r\\/proxychains-ng\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;Shell;C++"
	);

	public static final Project HEIMDAL = new Project(
		"heimdal",
		"https://github.com/heimdal/heimdal/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/heimdal/heimdal/issues",
		".*?(github\\.com\\/heimdal\\/heimdal\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;TeX;Shell;Makefile;M4;Perl;Python;Yacc;C++;Lex;Awk;Perl6;Objective-C;Java;Clarion;Assembly;HTML;RichTextFormat"
	);

	public static final Project LIBRESSL = new Project(
		"libressl",
		"https://github.com/robertbachmann/openbsd-libssl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/robertbachmann/openbsd-libssl/issues",
		".*?(github\\.com\\/robertbachmann\\/openbsd-libssl\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;Assembly;Groff;C++;M4;Shell;eC;Makefile"
	);

	public static final Project LIBRESSL_1 = new Project(
		"libressl",
		"https://github.com/libressl-portable/openbsd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libressl-portable/openbsd/issues",
		".*?(github\\.com\\/libressl-portable\\/openbsd\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;Perl;C++;Assembly;Makefile;Shell;Go;Objective-C;M4;eC;Awk"
	);

	public static final Project JERRYSCRIPT = new Project(
		"jerryscript",
		"https://github.com/jerryscript-project/jerryscript/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jerryscript-project/jerryscript/issues",
		".*?(github\\.com\\/jerryscript-project\\/jerryscript\\/issues\\/)([0-9]+)",
		2,
		"C;JavaScript;C++;Python;Shell;CMake;Tcl;Makefile;Assembly;Batchfile"
	);

	public static final Project JERRYSCRIPT_1 = new Project(
		"jerryscript",
		"https://github.com/zherczeg/jerryscript/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/zherczeg/jerryscript/issues",
		".*?(github\\.com\\/zherczeg\\/jerryscript\\/issues\\/)([0-9]+)",
		2,
		"C;JavaScript;C++;Python;Shell;CMake;Tcl;Makefile;Assembly;Batchfile"
	);

	public static final Project CEPH_STORAGE = new Project(
		"ceph_storage",
		"https://github.com/ceph/ceph/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ceph/ceph/issues",
		".*?(github\\.com\\/ceph\\/ceph\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;Terra;Shell;TypeScript;C;CMake;Perl;HTML;JavaScript;Java;Assembly;Perl6;CSS;Roff;Ruby;DIGITALCommandLanguage;Lua;Makefile;Dockerfile"
	);

	public static final Project RESIPROCATE = new Project(
		"resiprocate",
		"https://github.com/resiprocate/resiprocate/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/resiprocate/resiprocate/issues",
		".*?(github\\.com\\/resiprocate\\/resiprocate\\/issues\\/)([0-9]+)",
		2,
		"C++;C;C#;Makefile;Perl;Shell;M4;EmacsLisp;XS;HTML;PHP;Roff;OpenEdgeABL;Python;Assembly;PLpgSQL;Objective-C;Yacc;CSS;Awk;QMake;XSLT;Batchfile;Lex;Tcl;Hack;Perl6"
	);

	public static final Project ENTERPRISE_MRG = new Project(
		"enterprise_mrg",
		"https://github.com/mjg59/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mjg59/linux/issues",
		".*?(github\\.com\\/mjg59\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;C++;Makefile;Perl;Objective-C;Shell;Python;Yacc;Lex;Awk;UnrealScript;SourcePawn;Clojure"
	);

	public static final Project MPV = new Project(
		"mpv",
		"https://github.com/mpv-player/mpv/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mpv-player/mpv/issues",
		".*?(github\\.com\\/mpv-player\\/mpv\\/issues\\/)([0-9]+)",
		2,
		"C;Objective-C;Lua;Python;Swift;C++;JavaScript;Shell;Perl;Ruby;HLSL"
	);

	public static final Project ELECTRON = new Project(
		"electron",
		"https://github.com/electron/electron/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/electron/electron/issues",
		".*?(github\\.com\\/electron\\/electron\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;Objective-C++;TypeScript;Python;Objective-C;Shell;HTML;C;CSS;Dockerfile;HCL"
	);

	public static final Project CHATSECURE = new Project(
		"chatsecure",
		"https://github.com/ChatSecure/ChatSecure-iOS/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ChatSecure/ChatSecure-iOS/issues",
		".*?(github\\.com\\/ChatSecure\\/ChatSecure-iOS\\/issues\\/)([0-9]+)",
		2,
		"Objective-C;Swift;Ruby;Python;C++;C"
	);

	public static final Project ZONEMINDER = new Project(
		"zoneminder",
		"https://github.com/ZoneMinder/zoneminder/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ZoneMinder/zoneminder/issues",
		".*?(github\\.com\\/ZoneMinder\\/zoneminder\\/issues\\/)([0-9]+)",
		2,
		"PHP;Perl;C++;JavaScript;C;CSS;TSQL;Shell;CMake;HTML;PLpgSQL;Makefile;Batchfile"
	);

	public static final Project ZONEMINDER_1 = new Project(
		"zoneminder",
		"https://github.com/mnoorenberghe/ZoneMinder/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mnoorenberghe/ZoneMinder/issues",
		".*?(github\\.com\\/mnoorenberghe\\/ZoneMinder\\/issues\\/)([0-9]+)",
		2,
		"PHP;Perl;C++;JavaScript;C;CSS;Shell;CMake;PLpgSQL;HTML;Makefile;Batchfile;SQLPL"
	);

	public static final Project ZONEMINDER_2 = new Project(
		"zoneminder",
		"https://github.com/ZoneMinder/ZoneMinder/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ZoneMinder/ZoneMinder/issues",
		".*?(github\\.com\\/ZoneMinder\\/ZoneMinder\\/issues\\/)([0-9]+)",
		2,
		"PHP;Perl;C++;JavaScript;C;CSS;TSQL;Shell;CMake;HTML;PLpgSQL;Makefile;Batchfile"
	);

	public static final Project SUSE_LINUX_ENTERPRISE_DESKTOP = new Project(
		"suse_linux_enterprise_desktop",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project EXFAT = new Project(
		"exfat",
		"https://github.com/relan/exfat/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/relan/exfat/issues",
		".*?(github\\.com\\/relan\\/exfat\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;Roff;M4"
	);

	public static final Project SUSE_LINUX_ENTERPRISE_SERVER = new Project(
		"suse_linux_enterprise_server",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project ARDUINO_JSON = new Project(
		"arduino_json",
		"https://github.com/bblanchon/ArduinoJson/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/bblanchon/ArduinoJson/issues",
		".*?(github\\.com\\/bblanchon\\/ArduinoJson\\/issues\\/)([0-9]+)",
		2,
		"C++;CMake;Shell;Ruby;Makefile;C"
	);

	public static final Project ATTIC = new Project(
		"attic",
		"https://github.com/jborg/attic/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jborg/attic/issues",
		".*?(github\\.com\\/jborg\\/attic\\/issues\\/)([0-9]+)",
		2,
		"Python;C"
	);

	public static final Project DOSFSTOOLS = new Project(
		"dosfstools",
		"https://github.com/dosfstools/dosfstools/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dosfstools/dosfstools/issues",
		".*?(github\\.com\\/dosfstools\\/dosfstools\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;Makefile;Shell;M4;C++"
	);

	public static final Project GPAC = new Project(
		"gpac",
		"https://github.com/gpac/gpac/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/gpac/gpac/issues",
		".*?(github\\.com\\/gpac\\/gpac\\/issues\\/)([0-9]+)",
		2,
		"C;C++;JavaScript;Java;Shell;Makefile;XSLT;Objective-C;NSIS;Rebol;GLSL;Assembly;Batchfile;HTML;CSS"
	);

	public static final Project YODL = new Project(
		"yodl",
		"https://github.com/fbb-git/yodl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/fbb-git/yodl/issues",
		".*?(github\\.com\\/fbb-git\\/yodl\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Perl;Shell;TeX"
	);

	public static final Project STB_VORBIS = new Project(
		"stb_vorbis",
		"https://github.com/nothings/stb/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/nothings/stb/issues",
		".*?(github\\.com\\/nothings\\/stb\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Makefile;Batchfile"
	);

	public static final Project VIRTUALIZATION = new Project(
		"virtualization",
		"https://github.com/libarchive/libarchive/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libarchive/libarchive/issues",
		".*?(github\\.com\\/libarchive\\/libarchive\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;CMake;M4;Objective-C;Makefile;Shell;Batchfile;C++"
	);

	public static final Project IPERF = new Project(
		"iperf",
		"https://github.com/esnet/iperf/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/esnet/iperf/issues",
		".*?(github\\.com\\/esnet\\/iperf\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile;Roff;M4;Python;Gnuplot"
	);

	public static final Project LINUX_KERNEL = new Project(
		"linux_kernel",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project LINUX_KERNEL_1 = new Project(
		"linux_kernel",
		"https://github.com/stoth68000/media-tree/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/stoth68000/media-tree/issues",
		".*?(github\\.com\\/stoth68000\\/media-tree\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Makefile;Objective-C;Perl;Shell;Yacc;Python;Lex;Awk;GDB;UnrealScript;SourcePawn"
	);

	public static final Project LINUX_KERNEL_2 = new Project(
		"linux_kernel",
		"https://github.com/derrekr/android_security/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/derrekr/android_security/issues",
		".*?(github\\.com\\/derrekr\\/android_security\\/issues\\/)([0-9]+)",
		2,
		"C"
	);

	public static final Project LINUX_KERNEL_3 = new Project(
		"linux_kernel",
		"https://github.com/acpica/acpica/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/acpica/acpica/issues",
		".*?(github\\.com\\/acpica\\/acpica\\/issues\\/)([0-9]+)",
		2,
		"C;Yacc;C++;Shell;Lex;HTML;Objective-C;Makefile;Batchfile"
	);

	public static final Project LINUX_KERNEL_4 = new Project(
		"linux_kernel",
		"https://github.com/mjg59/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mjg59/linux/issues",
		".*?(github\\.com\\/mjg59\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;C++;Makefile;Perl;Objective-C;Shell;Python;Yacc;Lex;Awk;UnrealScript;SourcePawn;Clojure"
	);

	public static final Project NBD = new Project(
		"nbd",
		"https://github.com/yoe/nbd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/yoe/nbd/issues",
		".*?(github\\.com\\/yoe\\/nbd\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;Makefile;EmacsLisp"
	);

	public static final Project LIBEBML = new Project(
		"libebml",
		"https://github.com/Matroska-Org/libebml/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Matroska-Org/libebml/issues",
		".*?(github\\.com\\/Matroska-Org\\/libebml\\/issues\\/)([0-9]+)",
		2,
		"C++;C;CMake"
	);

	public static final Project BITCOIN_QT = new Project(
		"bitcoin-qt",
		"https://github.com/bitcoin/bitcoin/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/bitcoin/bitcoin/issues",
		".*?(github\\.com\\/bitcoin\\/bitcoin\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;C;M4;Makefile;Objective-C;Shell;Java;Assembly;HTML;Objective-C++;QMake"
	);

	public static final Project BITCOIN_QT_1 = new Project(
		"bitcoin-qt",
		"https://github.com/sipa/bitcoin/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/sipa/bitcoin/issues",
		".*?(github\\.com\\/sipa\\/bitcoin\\/issues\\/)([0-9]+)",
		2,
		"TypeScript;C++;C;Python;Shell;Objective-C;CSS;IDL"
	);

	public static final Project MEMCACHED = new Project(
		"memcached",
		"https://github.com/memcached/memcached/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/memcached/memcached/issues",
		".*?(github\\.com\\/memcached\\/memcached\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;M4;Python;DTrace;C++;Shell;Makefile;Roff;Objective-C"
	);

	public static final Project COROSYNC = new Project(
		"corosync",
		"https://github.com/corosync/corosync/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/corosync/corosync/issues",
		".*?(github\\.com\\/corosync\\/corosync\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;M4;Objective-C;Shell;C++;Augeas;XSLT"
	);

	public static final Project WIRESHARK = new Project(
		"wireshark",
		"https://github.com/wireshark/wireshark/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/wireshark/wireshark/issues",
		".*?(github\\.com\\/wireshark\\/wireshark\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Objective-C;Python;Perl;CMake;Lua;Shell;Lex;NSIS;CSS;PowerShell;Yacc;HTML;XSLT;PostScript;Ruby;JavaScript;Awk;Objective-C++"
	);

	public static final Project MEDIAELEMENT_JS = new Project(
		"mediaelement.js",
		"https://github.com/johndyer/mediaelement/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/johndyer/mediaelement/issues",
		".*?(github\\.com\\/johndyer\\/mediaelement\\/issues\\/)([0-9]+)",
		2,
		"JavaScript;ActionScript;CSS;AngelScript;C;Shell;HTML"
	);

	public static final Project LINUX_ENTERPRISE_DESKTOP = new Project(
		"linux_enterprise_desktop",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project SQUIDCLAMAV = new Project(
		"squidclamav",
		"https://github.com/darold/squidclamav/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/darold/squidclamav/issues",
		".*?(github\\.com\\/darold\\/squidclamav\\/issues\\/)([0-9]+)",
		2,
		"Shell;C;Makefile;Perl;M4"
	);

	public static final Project MOSQUITTO = new Project(
		"mosquitto",
		"https://github.com/eclipse/mosquitto/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/eclipse/mosquitto/issues",
		".*?(github\\.com\\/eclipse\\/mosquitto\\/issues\\/)([0-9]+)",
		2,
		"C;Python;CSS;C++;Makefile;HTML;CMake;Dockerfile;NSIS;Shell;Perl;Ruby;XSLT"
	);

	public static final Project THRIFT = new Project(
		"thrift",
		"https://github.com/facebook/fbthrift/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/facebook/fbthrift/issues",
		".*?(github\\.com\\/facebook\\/fbthrift\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;Java;Hack;D;HTML;Go;PHP;Ruby;Haskell;Thrift;Objective-C;C;Perl;CMake;TeX;Yacc;OCaml;C#;Smalltalk;Shell;Erlang;Lex;Makefile;EmacsLisp;Vimscript;M4"
	);

	public static final Project ENTERPRISE_LINUX = new Project(
		"enterprise_linux",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project ENTERPRISE_LINUX_1 = new Project(
		"enterprise_linux",
		"https://github.com/ClusterLabs/pacemaker/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ClusterLabs/pacemaker/issues",
		".*?(github\\.com\\/ClusterLabs\\/pacemaker\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Shell;XSLT;M4;Makefile;Roff;C++"
	);

	public static final Project ENTERPRISE_LINUX_2 = new Project(
		"enterprise_linux",
		"https://github.com/hercules-team/augeas/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/hercules-team/augeas/issues",
		".*?(github\\.com\\/hercules-team\\/augeas\\/issues\\/)([0-9]+)",
		2,
		"Augeas;C;Shell;Yacc;Makefile;M4;C++"
	);

	public static final Project ENTERPRISE_LINUX_3 = new Project(
		"enterprise_linux",
		"https://github.com/krb5/krb5/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/krb5/krb5/issues",
		".*?(github\\.com\\/krb5\\/krb5\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Roff;Makefile;HTML;Shell;M4;Perl;TeX;Assembly;Yacc;Awk;EmacsLisp;RPC;Perl6;CSS;Batchfile;Lex;sed"
	);

	public static final Project MAC_OS_X = new Project(
		"mac_os_x",
		"https://github.com/ruby/ruby/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ruby/ruby/issues",
		".*?(github\\.com\\/ruby\\/ruby\\/issues\\/)([0-9]+)",
		2,
		"Ruby;C;Objective-C;Yacc;Makefile;M4;C++;GDB;Ragel;HTML;JavaScript;CSS;XSLT;Python;Batchfile;Shell;Assembly;EmacsLisp;sed;Scilab;Scheme;Perl;Perl6"
	);

	public static final Project YAST2 = new Project(
		"yast2",
		"https://github.com/yast/yast-core/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/yast/yast-core/issues",
		".*?(github\\.com\\/yast\\/yast-core\\/issues\\/)([0-9]+)",
		2,
		"C++;HTML;Perl;Makefile;Ruby;Roff;C;Shell;CSS;XSLT;Objective-C;PHP;Dockerfile;EmacsLisp"
	);

	public static final Project JANSSON = new Project(
		"jansson",
		"https://github.com/akheron/jansson/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/akheron/jansson/issues",
		".*?(github\\.com\\/akheron\\/jansson\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Shell;M4;Makefile"
	);

	public static final Project LIBZIP = new Project(
		"libzip",
		"https://github.com/nih-at/libzip/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/nih-at/libzip/issues",
		".*?(github\\.com\\/nih-at\\/libzip\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;CMake;Shell;Batchfile;Dockerfile"
	);

	public static final Project OK_WEB_SERVER = new Project(
		"ok_web_server",
		"https://github.com/okws/okws/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/okws/okws/issues",
		".*?(github\\.com\\/okws\\/okws\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Python;Makefile;CMake;Logos;M4;Perl6;HTML;Shell;Perl;Yacc;PHP"
	);

	public static final Project PILLOW = new Project(
		"pillow",
		"https://github.com/python-imaging/Pillow/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/python-imaging/Pillow/issues",
		".*?(github\\.com\\/python-imaging\\/Pillow\\/issues\\/)([0-9]+)",
		2,
		"Python;C;HTML;PostScript;Shell;Makefile;C++;Gnuplot;Batchfile"
	);

	public static final Project PILLOW_1 = new Project(
		"pillow",
		"https://github.com/python-pillow/Pillow/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/python-pillow/Pillow/issues",
		".*?(github\\.com\\/python-pillow\\/Pillow\\/issues\\/)([0-9]+)",
		2,
		"Python;C;HTML;PostScript;Shell;Makefile;C++;Gnuplot;Batchfile"
	);

	public static final Project LITTLE_CMS_COLOR_ENGINE = new Project(
		"little_cms_color_engine",
		"https://github.com/mm2/Little-CMS/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mm2/Little-CMS/issues",
		".*?(github\\.com\\/mm2\\/Little-CMS\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile;Pascal;M4;Roff;C++;Batchfile"
	);

	public static final Project NMAP = new Project(
		"nmap",
		"https://github.com/drk1wi/portspoof/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/drk1wi/portspoof/issues",
		".*?(github\\.com\\/drk1wi\\/portspoof\\/issues\\/)([0-9]+)",
		2,
		"Makefile;C++;Shell;C;M4"
	);

	public static final Project VIM = new Project(
		"vim",
		"https://github.com/neovim/neovim/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/neovim/neovim/issues",
		".*?(github\\.com\\/neovim\\/neovim\\/issues\\/)([0-9]+)",
		2,
		"Vimscript;C;Lua;Python;Objective-C;C++;CMake;Shell;PostScript;CSS;Awk;Perl;Makefile;PowerShell;HTML;Batchfile;Ruby"
	);

	public static final Project VIM_1 = new Project(
		"vim",
		"https://github.com/vim/vim/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/vim/vim/issues",
		".*?(github\\.com\\/vim\\/vim\\/issues\\/)([0-9]+)",
		2,
		"Vimscript;C;Roff;Makefile;C++;M4;Objective-C;NSIS;PostScript;Perl;XS;ModuleManagementSystem;NewLisp;Shell;Ruby;EmacsLisp;SystemVerilog;JavaScript;Smalltalk;Python;Awk;DIGITALCommandLanguage;Batchfile;MATLAB;Tcl;HTML;IDL;Prolog"
	);

	public static final Project BRO = new Project(
		"bro",
		"https://github.com/bro/bro/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/bro/bro/issues",
		".*?(github\\.com\\/bro\\/bro\\/issues\\/)([0-9]+)",
		2,
		"Zeek;C++;JavaScript;C;StandardML;CMake;Yacc;Shell;Lex;GLSL;Roff;Objective-C;Python;Makefile"
	);

	public static final Project IRCD_RATBOX = new Project(
		"ircd-ratbox",
		"https://github.com/atheme/charybdis/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/atheme/charybdis/issues",
		".*?(github\\.com\\/atheme\\/charybdis\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;Makefile;Lex;Yacc;Roff;C++"
	);

	public static final Project MINISSPD = new Project(
		"minisspd",
		"https://github.com/miniupnp/miniupnp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/miniupnp/miniupnp/issues",
		".*?(github\\.com\\/miniupnp\\/miniupnp\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile;Python;CMake;Roff;Java;VisualBasic;Ruby;Batchfile"
	);

	public static final Project BZRTP = new Project(
		"bzrtp",
		"https://github.com/BelledonneCommunications/bzrtp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/BelledonneCommunications/bzrtp/issues",
		".*?(github\\.com\\/BelledonneCommunications\\/bzrtp\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;M4;Makefile;Shell"
	);

	public static final Project VIRTIO_WIN = new Project(
		"virtio-win",
		"https://github.com/YanVugenfirer/kvm-guest-drivers-windows/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/YanVugenfirer/kvm-guest-drivers-windows/issues",
		".*?(github\\.com\\/YanVugenfirer\\/kvm-guest-drivers-windows\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Batchfile;Objective-C;Ruby;JavaScript;VisualBasic;Makefile"
	);

	public static final Project FEH = new Project(
		"feh",
		"https://github.com/derf/feh/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/derf/feh/issues",
		".*?(github\\.com\\/derf\\/feh\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;Makefile;C++;Shell"
	);

	public static final Project PERL = new Project(
		"perl",
		"https://github.com/Perl/perl5/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Perl/perl5/issues",
		".*?(github\\.com\\/Perl\\/perl5\\/issues\\/)([0-9]+)",
		2,
		"Perl;C;Shell;XS;C++;Perl6;Objective-C;Makefile;DIGITALCommandLanguage;PLSQL;Prolog;Yacc;Assembly;Roff;Batchfile;Pawn;PHP;TeX;DTrace;EmacsLisp"
	);

	public static final Project SUSE_LINUX_ENTERPRISE_SOFTWARE_DEVELOPMENT_KIT = new Project(
		"suse_linux_enterprise_software_development_kit",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project PRAGYAN_CMS = new Project(
		"pragyan_cms",
		"https://github.com/delta/pragyan/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/delta/pragyan/issues",
		".*?(github\\.com\\/delta\\/pragyan\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;CSS;HTML;ASP;C++;Python;Shell;C"
	);

	public static final Project JABBERD2 = new Project(
		"jabberd2",
		"https://github.com/Jabberd2/jabberd2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Jabberd2/jabberd2/issues",
		".*?(github\\.com\\/Jabberd2\\/jabberd2\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Perl;Shell;Makefile;Python;C++;Ruby;QMake"
	);

	public static final Project JABBERD2_1 = new Project(
		"jabberd2",
		"https://github.com/jabberd2/jabberd2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jabberd2/jabberd2/issues",
		".*?(github\\.com\\/jabberd2\\/jabberd2\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Perl;Shell;Makefile;Python;C++;Ruby;QMake"
	);

	public static final Project RUST = new Project(
		"rust",
		"https://github.com/rust-lang/rust/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/rust-lang/rust/issues",
		".*?(github\\.com\\/rust-lang\\/rust\\/issues\\/)([0-9]+)",
		2,
		"Rust;Python;JavaScript;C++;Makefile;Yacc;Shell;Dockerfile;CSS;C;Roff;InnoSetup;Pascal;Assembly;Lex;XSLT;Puppet;Logos;RenderScript;HTML;Batchfile;PHP"
	);

	public static final Project QUASSEL_IRC = new Project(
		"quassel_irc",
		"https://github.com/quassel/quassel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/quassel/quassel/issues",
		".*?(github\\.com\\/quassel\\/quassel\\/issues\\/)([0-9]+)",
		2,
		"C++;Perl;CMake;Python;Shell;Objective-C++;PLpgSQL;C;PLSQL"
	);

	public static final Project IMAGEWORSENER = new Project(
		"imageworsener",
		"https://github.com/jsummers/imageworsener/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jsummers/imageworsener/issues",
		".*?(github\\.com\\/jsummers\\/imageworsener\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;Makefile"
	);

	public static final Project GIFSICLE = new Project(
		"gifsicle",
		"https://github.com/kohler/gifsicle/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kohler/gifsicle/issues",
		".*?(github\\.com\\/kohler\\/gifsicle\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;Roff;M4;Makefile;Shell"
	);

	public static final Project YTNEF = new Project(
		"ytnef",
		"https://github.com/Yeraze/ytnef/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Yeraze/ytnef/issues",
		".*?(github\\.com\\/Yeraze\\/ytnef\\/issues\\/)([0-9]+)",
		2,
		"Shell;C;HTML;C++;Perl;M4;Makefile"
	);

	public static final Project POSTGRESQL = new Project(
		"postgresql",
		"https://github.com/postgres/postgres/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/postgres/postgres/issues",
		".*?(github\\.com\\/postgres\\/postgres\\/issues\\/)([0-9]+)",
		2,
		"C;PLpgSQL;C++;Perl;TSQL;Yacc;Objective-C;Makefile;SQLPL;Lex;M4;Ruby;Shell;Python;Roff;PLSQL;Batchfile;XS;EmacsLisp;DTrace;Assembly;sed"
	);

	public static final Project LIBOPENMPT = new Project(
		"libopenmpt",
		"https://github.com/OpenMPT/openmpt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/OpenMPT/openmpt/issues",
		".*?(github\\.com\\/OpenMPT\\/openmpt\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Lua;Makefile;Batchfile;M4;InnoSetup;Shell;Python;Perl;HTML;Roff;VisualBasic;PowerShell;CSS;JavaScript"
	);

	public static final Project BUBBLEWRAP = new Project(
		"bubblewrap",
		"https://github.com/projectatomic/bubblewrap/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/projectatomic/bubblewrap/issues",
		".*?(github\\.com\\/projectatomic\\/bubblewrap\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;Makefile;EmacsLisp"
	);

	public static final Project IOQUAKE3 = new Project(
		"ioquake3",
		"https://github.com/iortcw/iortcw/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/iortcw/iortcw/issues",
		".*?(github\\.com\\/iortcw\\/iortcw\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Objective-C;Python;Makefile;HTML;Assembly;GLSL;CMake;Perl;Roff;Shell;Yacc"
	);

	public static final Project IOQUAKE3_1 = new Project(
		"ioquake3",
		"https://github.com/ioquake/ioq3/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ioquake/ioq3/issues",
		".*?(github\\.com\\/ioquake\\/ioq3\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Objective-C;Makefile;HTML;Assembly;GLSL;Shell;Roff;CMake;NSIS;Perl;Yacc;RichTextFormat;VisualBasic"
	);

	public static final Project IOQUAKE3_2 = new Project(
		"ioquake3",
		"https://github.com/JACoders/OpenJK/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/JACoders/OpenJK/issues",
		".*?(github\\.com\\/JACoders\\/OpenJK\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Objective-C;CMake;Batchfile;Shell"
	);

	public static final Project ROOT = new Project(
		"root",
		"https://github.com/root-project/root/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/root-project/root/issues",
		".*?(github\\.com\\/root-project\\/root\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Python;JavaScript;HTML;Roff;CMake;Objective-C++;Objective-C;Fortran;OCaml;Shell;Makefile;CSS;Go;Cuda;Perl;EmacsLisp;Batchfile;C#;JupyterNotebook;Vimscript;Dockerfile;Pawn;AppleScript;XSLT;Smarty;R"
	);

	public static final Project RUFUS = new Project(
		"rufus",
		"https://github.com/pbatard/rufus/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/pbatard/rufus/issues",
		".*?(github\\.com\\/pbatard\\/rufus\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;C++;C#;Shell;Assembly;Objective-C;Python;Batchfile;M4;sed"
	);

	public static final Project NAUTILUS = new Project(
		"nautilus",
		"https://github.com/GNOME/nautilus/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/nautilus/issues",
		".*?(github\\.com\\/GNOME\\/nautilus\\/issues\\/)([0-9]+)",
		2,
		"C;Meson;Python;Shell;CSS;C++;Objective-C"
	);

	public static final Project LIBFEP = new Project(
		"libfep",
		"https://github.com/ueno/libfep/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ueno/libfep/issues",
		".*?(github\\.com\\/ueno\\/libfep\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;C++;Vala"
	);

	public static final Project TCPFLOW = new Project(
		"tcpflow",
		"https://github.com/simsong/tcpflow/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/simsong/tcpflow/issues",
		".*?(github\\.com\\/simsong\\/tcpflow\\/issues\\/)([0-9]+)",
		2,
		"C++;C;M4;CMake;Shell;Makefile;Python"
	);

	public static final Project ENTERPRISE_COMMUNICATIONS_BROKER = new Project(
		"enterprise_communications_broker",
		"https://github.com/embedthis/appweb/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/embedthis/appweb/issues",
		".*?(github\\.com\\/embedthis\\/appweb\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Makefile;Scilab;Roff;Shell;JavaScript;InnoSetup;CSS;C++;Batchfile;RichTextFormat;Perl6;Perl;Ruby;TypeScript;Python;PHP"
	);

	public static final Project LXML = new Project(
		"lxml",
		"https://github.com/lxml/lxml/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/lxml/lxml/issues",
		".*?(github\\.com\\/lxml\\/lxml\\/issues\\/)([0-9]+)",
		2,
		"Python;XSLT;C;HTML;Makefile;Shell"
	);

	public static final Project DAS_WATCHDOG = new Project(
		"das_watchdog",
		"https://github.com/kmatheussen/das_watchdog/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kmatheussen/das_watchdog/issues",
		".*?(github\\.com\\/kmatheussen\\/das_watchdog\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile"
	);

	public static final Project LIBRSVG = new Project(
		"librsvg",
		"https://github.com/ImageMagick/librsvg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ImageMagick/librsvg/issues",
		".*?(github\\.com\\/ImageMagick\\/librsvg\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;Shell;HTML;M4;C++;Meson;Objective-C;Python;Assembly;Roff;CSS;TeX;Vala;Perl"
	);

	public static final Project LIBRSVG_1 = new Project(
		"librsvg",
		"https://github.com/GNOME/librsvg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/librsvg/issues",
		".*?(github\\.com\\/GNOME\\/librsvg\\/issues\\/)([0-9]+)",
		2,
		"Rust;C;Makefile;M4;Shell;Python;Roff;Vala"
	);

	public static final Project BOTAN = new Project(
		"botan",
		"https://github.com/randombit/botan/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/randombit/botan/issues",
		".*?(github\\.com\\/randombit\\/botan\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;C;Shell;EmacsLisp;Batchfile;HTML"
	);

	public static final Project TEEWORLDS = new Project(
		"teeworlds",
		"https://github.com/teeworlds/teeworlds/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/teeworlds/teeworlds/issues",
		".*?(github\\.com\\/teeworlds\\/teeworlds\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;C;CMake;Lua;Objective-C;Objective-C++;Shell;Batchfile"
	);

	public static final Project PECL_HTTP = new Project(
		"pecl_http",
		"https://github.com/m6w6/ext-http/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/m6w6/ext-http/issues",
		".*?(github\\.com\\/m6w6\\/ext-http\\/issues\\/)([0-9]+)",
		2,
		"C;PHP;M4;Objective-C;C++;Shell;Makefile;HTML"
	);

	public static final Project UNIXODBC = new Project(
		"unixodbc",
		"https://github.com/lurcher/unixODBC/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/lurcher/unixODBC/issues",
		".*?(github\\.com\\/lurcher\\/unixODBC\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Roff;M4;Makefile;Yacc;DIGITALCommandLanguage;C++"
	);

	public static final Project HIPHOP_VIRTUAL_MACHINE = new Project(
		"hiphop_virtual_machine",
		"https://github.com/facebook/hhvm/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/facebook/hhvm/issues",
		".*?(github\\.com\\/facebook\\/hhvm\\/issues\\/)([0-9]+)",
		2,
		"C++;Hack;OCaml;Rust;C;PHP;JavaScript;CMake;Python;Yacc;Objective-C;Shell;Assembly;StandardML;Roff;LLVM;XSLT;Perl;GDB;Batchfile;CSS;Makefile;HTML;Awk"
	);

	public static final Project PIGZ = new Project(
		"pigz",
		"https://github.com/madler/pigz/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/madler/pigz/issues",
		".*?(github\\.com\\/madler\\/pigz\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Objective-C;Roff;Makefile"
	);

	public static final Project LIBRESWAN = new Project(
		"libreswan",
		"https://github.com/libreswan/libreswan/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libreswan/libreswan/issues",
		".*?(github\\.com\\/libreswan\\/libreswan\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Python;Makefile;Assembly;JavaScript;C++;Perl;Objective-C;Roff;sed;Yacc;Lex;Dockerfile;HTML;Awk;CSS;GDB"
	);

	public static final Project SFNTLY = new Project(
		"sfntly",
		"https://github.com/googlei18n/sfntly/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/googlei18n/sfntly/issues",
		".*?(github\\.com\\/googlei18n\\/sfntly\\/issues\\/)([0-9]+)",
		2,
		"Java;C++;Python;CMake;C"
	);

	public static final Project SGMINER = new Project(
		"sgminer",
		"https://github.com/ckolivas/cgminer/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ckolivas/cgminer/issues",
		".*?(github\\.com\\/ckolivas\\/cgminer\\/issues\\/)([0-9]+)",
		2,
		"C;M4;PHP;CMake;C++;Makefile;Shell;Python;Java;Ruby"
	);

	public static final Project SGMINER_1 = new Project(
		"sgminer",
		"https://github.com/luke-jr/bfgminer/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/luke-jr/bfgminer/issues",
		".*?(github\\.com\\/luke-jr\\/bfgminer\\/issues\\/)([0-9]+)",
		2,
		"C;M4;PHP;C++;Makefile;Assembly;Shell;Python;Ruby"
	);

	public static final Project SGMINER_2 = new Project(
		"sgminer",
		"https://github.com/sgminer-dev/sgminer/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/sgminer-dev/sgminer/issues",
		".*?(github\\.com\\/sgminer-dev\\/sgminer\\/issues\\/)([0-9]+)",
		2,
		"C;C++;PHP;Java;Python;Shell;Batchfile;Objective-C"
	);

	public static final Project TELEGRAM_DESKTOP = new Project(
		"telegram_desktop",
		"https://github.com/telegramdesktop/tdesktop/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/telegramdesktop/tdesktop/issues",
		".*?(github\\.com\\/telegramdesktop\\/tdesktop\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;Objective-C++;Shell;Batchfile;Objective-C;CSS;C;CMake;InnoSetup;JavaScript;VisualBasic"
	);

	public static final Project MAC_TELNET = new Project(
		"mac-telnet",
		"https://github.com/haakonnessjoen/MAC-Telnet/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/haakonnessjoen/MAC-Telnet/issues",
		".*?(github\\.com\\/haakonnessjoen\\/MAC-Telnet\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;Makefile;Dockerfile;sed;C++"
	);

	public static final Project ITERM2 = new Project(
		"iterm2",
		"https://github.com/gnachman/iTerm2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/gnachman/iTerm2/issues",
		".*?(github\\.com\\/gnachman\\/iTerm2\\/issues\\/)([0-9]+)",
		2,
		"Objective-C;Python;Objective-C++;HTML;Shell;Metal;C;Swift;Perl;C++;JavaScript;Makefile;VisualBasic;AppleScript;RichTextFormat"
	);

	public static final Project OPENSC = new Project(
		"opensc",
		"https://github.com/OpenSC/OpenSC/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/OpenSC/OpenSC/issues",
		".*?(github\\.com\\/OpenSC\\/OpenSC\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Makefile;Shell;C++;Objective-C;Roff;Lex;AppleScript"
	);

	public static final Project LIBAV = new Project(
		"libav",
		"https://github.com/FFmpeg/FFmpeg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/FFmpeg/FFmpeg/issues",
		".*?(github\\.com\\/FFmpeg\\/FFmpeg\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;Objective-C;Makefile;C++;Shell;Cuda;Perl;Awk;Python;HTML;Ruby;Verilog;Roff"
	);

	public static final Project LIBAV_1 = new Project(
		"libav",
		"https://github.com/libav/libav/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libav/libav/issues",
		".*?(github\\.com\\/libav\\/libav\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;Objective-C;Makefile;C++;Shell;Perl;Verilog;Roff"
	);

	public static final Project CEPH_STORAGE_MON = new Project(
		"ceph_storage_mon",
		"https://github.com/ceph/ceph/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ceph/ceph/issues",
		".*?(github\\.com\\/ceph\\/ceph\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;Terra;Shell;TypeScript;C;CMake;Perl;HTML;JavaScript;Java;Assembly;Perl6;CSS;Roff;Ruby;DIGITALCommandLanguage;Lua;Makefile;Dockerfile"
	);

	public static final Project SYSTEMD = new Project(
		"systemd",
		"https://github.com/systemd/systemd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/systemd/systemd/issues",
		".*?(github\\.com\\/systemd\\/systemd\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Shell;Meson;HTML;Perl;C++;M4;Objective-C;Awk;EmacsLisp;Dockerfile;Vimscript;Makefile;sed"
	);

	public static final Project SYSTEMD_1 = new Project(
		"systemd",
		"https://github.com/keszybz/systemd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/keszybz/systemd/issues",
		".*?(github\\.com\\/keszybz\\/systemd\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Shell;Meson;HTML;Perl;C++;M4;Objective-C;Awk;EmacsLisp;Dockerfile;Makefile;Vimscript;sed"
	);

	public static final Project INTERNATIONAL_COMPONENTS_FOR_UNICODE = new Project(
		"international_components_for_unicode",
		"https://github.com/unicode-org/icu/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/unicode-org/icu/issues",
		".*?(github\\.com\\/unicode-org\\/icu\\/issues\\/)([0-9]+)",
		2,
		"C++;Java;C;Objective-C;Makefile;Perl;HTML;Python;Shell;M4;Roff;XSLT;CSS;Batchfile;PowerShell;sed;CMake;EmacsLisp"
	);

	public static final Project CABEXTRACT = new Project(
		"cabextract",
		"https://github.com/kyz/libmspack/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kyz/libmspack/issues",
		".*?(github\\.com\\/kyz\\/libmspack\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;HTML;Perl;M4;Roff;Makefile"
	);

	public static final Project OPENVPN = new Project(
		"openvpn",
		"https://github.com/OpenVPN/openvpn/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/OpenVPN/openvpn/issues",
		".*?(github\\.com\\/OpenVPN\\/openvpn\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;C++;Makefile;JavaScript;Batchfile"
	);

	public static final Project AXTLS = new Project(
		"axtls",
		"https://github.com/igrr/axtls-8266/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/igrr/axtls-8266/issues",
		".*?(github\\.com\\/igrr\\/axtls-8266\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;C#;Shell;Perl;Java;Lua;Makefile"
	);

	public static final Project CRYPTO002B002B_LIBRARY = new Project(
		"crypto++_library",
		"https://github.com/weidai11/cryptopp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/weidai11/cryptopp/issues",
		".*?(github\\.com\\/weidai11\\/cryptopp\\/issues\\/)([0-9]+)",
		2,
		"C++;Shell;Assembly;C;Makefile;Batchfile"
	);

	public static final Project PAM_U2F = new Project(
		"pam-u2f",
		"https://github.com/Yubico/pam-u2f/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Yubico/pam-u2f/issues",
		".*?(github\\.com\\/Yubico\\/pam-u2f\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Makefile;Shell"
	);

	public static final Project PYTHON = new Project(
		"python",
		"https://github.com/python/cpython/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/python/cpython/issues",
		".*?(github\\.com\\/python\\/cpython\\/issues\\/)([0-9]+)",
		2,
		"Python;C;Objective-C;C++;HTML;M4;Batchfile;Shell;Assembly;Roff;Makefile;CommonLisp;PLSQL;PowerShell;RichTextFormat;DTrace;XSLT;CSS;VisualBasic"
	);

	public static final Project MINISPHERE = new Project(
		"minisphere",
		"https://github.com/fatcerberus/minisphere/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/fatcerberus/minisphere/issues",
		".*?(github\\.com\\/fatcerberus\\/minisphere\\/issues\\/)([0-9]+)",
		2,
		"C;JavaScript;C#;C++;Roff;InnoSetup;Makefile;GLSL;Batchfile"
	);

	public static final Project OPENJPEG = new Project(
		"openjpeg",
		"https://github.com/uclouvain/openjpeg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/uclouvain/openjpeg/issues",
		".*?(github\\.com\\/uclouvain\\/openjpeg\\/issues\\/)([0-9]+)",
		2,
		"C;C++;CMake;Java;Shell;Tcl;Objective-C;Python;InnoSetup;HTML;Makefile"
	);

	public static final Project OPENJPEG_1 = new Project(
		"openjpeg",
		"https://github.com/szukw000/openjpeg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/szukw000/openjpeg/issues",
		".*?(github\\.com\\/szukw000\\/openjpeg\\/issues\\/)([0-9]+)",
		2,
		"C;C++;CMake;Java;Shell;Tcl;Objective-C;Python;InnoSetup;HTML;Makefile"
	);

	public static final Project OPENJPEG_2 = new Project(
		"openjpeg",
		"https://github.com/kbabioch/openjpeg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kbabioch/openjpeg/issues",
		".*?(github\\.com\\/kbabioch\\/openjpeg\\/issues\\/)([0-9]+)",
		2,
		"C;C++;CMake;Java;Shell;Tcl;Objective-C;Python;InnoSetup;HTML;Makefile"
	);

	public static final Project AFFLIB = new Project(
		"afflib",
		"https://github.com/sshock/AFFLIBv3/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/sshock/AFFLIBv3/issues",
		".*?(github\\.com\\/sshock\\/AFFLIBv3\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Shell;Makefile;M4;HTML;Python;Objective-C;Batchfile"
	);

	public static final Project LIBIMOBILEDEVICE = new Project(
		"libimobiledevice",
		"https://github.com/libimobiledevice/libusbmuxd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libimobiledevice/libusbmuxd/issues",
		".*?(github\\.com\\/libimobiledevice\\/libusbmuxd\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Makefile;Shell"
	);

	public static final Project LIBIMOBILEDEVICE_1 = new Project(
		"libimobiledevice",
		"https://github.com/libimobiledevice/libimobiledevice/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libimobiledevice/libimobiledevice/issues",
		".*?(github\\.com\\/libimobiledevice\\/libimobiledevice\\/issues\\/)([0-9]+)",
		2,
		"C;Python;M4;Objective-C;Makefile;C++;Shell"
	);

	public static final Project DOLIBARR = new Project(
		"dolibarr",
		"https://github.com/GPCsolutions/dolibarr/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GPCsolutions/dolibarr/issues",
		".*?(github\\.com\\/GPCsolutions\\/dolibarr\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;CSS;HTML;SQLPL;Perl;Shell;InnoSetup;C;PLpgSQL;Makefile;C++;Batchfile;ApacheConf"
	);

	public static final Project DOLIBARR_1 = new Project(
		"dolibarr",
		"https://github.com/Dolibarr/dolibarr/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Dolibarr/dolibarr/issues",
		".*?(github\\.com\\/Dolibarr\\/dolibarr\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;TSQL;CSS;HTML;SQLPL;Perl;Shell;InnoSetup;PLpgSQL;C;Python;Perl6;Makefile;C++;Hack;Dockerfile;Batchfile"
	);

	public static final Project PYTHON_IMAGING = new Project(
		"python-imaging",
		"https://github.com/python-pillow/Pillow/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/python-pillow/Pillow/issues",
		".*?(github\\.com\\/python-pillow\\/Pillow\\/issues\\/)([0-9]+)",
		2,
		"Python;C;HTML;PostScript;Shell;Makefile;C++;Gnuplot;Batchfile"
	);

	public static final Project PPP = new Project(
		"ppp",
		"https://github.com/paulusmack/ppp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/paulusmack/ppp/issues",
		".*?(github\\.com\\/paulusmack\\/ppp\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;C++;Shell;Perl"
	);

	public static final Project HTTP_SERVER = new Project(
		"http_server",
		"https://github.com/apache/httpd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/apache/httpd/issues",
		".*?(github\\.com\\/apache\\/httpd\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;CMake;Makefile;Awk;C++;Python;Perl;GDB;Lex;Lua;DTrace;Yacc;Perl6;SourcePawn;PHP"
	);

	public static final Project HHVM = new Project(
		"hhvm",
		"https://github.com/facebook/hhvm/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/facebook/hhvm/issues",
		".*?(github\\.com\\/facebook\\/hhvm\\/issues\\/)([0-9]+)",
		2,
		"C++;Hack;OCaml;Rust;C;PHP;JavaScript;CMake;Python;Yacc;Objective-C;Shell;Assembly;StandardML;Roff;LLVM;XSLT;Perl;GDB;Batchfile;CSS;Makefile;HTML;Awk"
	);

	public static final Project LUCI = new Project(
		"luci",
		"https://github.com/openwrt/luci/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/openwrt/luci/issues",
		".*?(github\\.com\\/openwrt\\/luci\\/issues\\/)([0-9]+)",
		2,
		"Lua;C;HTML;JavaScript;CSS;Makefile;Shell;Java;Perl;C#;VisualBasic;Yacc;Lex;C++;Python;CMake"
	);

	public static final Project RADARE2 = new Project(
		"radare2",
		"https://github.com/radare/radare2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/radare/radare2/issues",
		".*?(github\\.com\\/radare\\/radare2\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Objective-C;JavaScript;Makefile;Shell;Meson;HTML;Roff;Python;Perl;CSS;Dockerfile;Batchfile;Assembly;Vala;R;RichTextFormat;Rascal"
	);

	public static final Project RADARE2_1 = new Project(
		"radare2",
		"https://github.com/devnexen/radare2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/devnexen/radare2/issues",
		".*?(github\\.com\\/devnexen\\/radare2\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Objective-C;JavaScript;Makefile;Shell;Meson;HTML;Roff;Python;Perl;CSS;Dockerfile;Batchfile;Assembly;Vala;R;RichTextFormat;Rascal"
	);

	public static final Project GANGLIA_WEB = new Project(
		"ganglia-web",
		"https://github.com/ganglia/ganglia-web/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ganglia/ganglia-web/issues",
		".*?(github\\.com\\/ganglia\\/ganglia-web\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;Smarty;CSS;C;Shell;Makefile;HTML"
	);

	public static final Project ETTERCAP = new Project(
		"ettercap",
		"https://github.com/Ettercap/ettercap/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Ettercap/ettercap/issues",
		".*?(github\\.com\\/Ettercap\\/ettercap\\/issues\\/)([0-9]+)",
		2,
		"C;Lua;CMake;1CEnterprise;NSIS;Yacc;Shell;Lex;C++;Objective-C"
	);

	public static final Project ETTERCAP_1 = new Project(
		"ettercap",
		"https://github.com/LocutusOfBorg/ettercap/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/LocutusOfBorg/ettercap/issues",
		".*?(github\\.com\\/LocutusOfBorg\\/ettercap\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Lua;1CEnterprise;NSIS;Yacc;Shell;Lex;C++;Objective-C"
	);

	public static final Project AUGEAS = new Project(
		"augeas",
		"https://github.com/hercules-team/augeas/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/hercules-team/augeas/issues",
		".*?(github\\.com\\/hercules-team\\/augeas\\/issues\\/)([0-9]+)",
		2,
		"Augeas;C;Shell;Yacc;Makefile;M4;C++"
	);

	public static final Project FISH = new Project(
		"fish",
		"https://github.com/fish-shell/fish-shell/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/fish-shell/fish-shell/issues",
		".*?(github\\.com\\/fish-shell\\/fish-shell\\/issues\\/)([0-9]+)",
		2,
		"Shell;C++;Python;CMake;JavaScript;HTML;CSS;Objective-C;C;Makefile;RichTextFormat;Roff;Dockerfile"
	);

	public static final Project PYBITMESSAGE = new Project(
		"pybitmessage",
		"https://github.com/Bitmessage/PyBitmessage/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Bitmessage/PyBitmessage/issues",
		".*?(github\\.com\\/Bitmessage\\/PyBitmessage\\/issues\\/)([0-9]+)",
		2,
		"Python;Shell;C;C++;Makefile;QMake;Dockerfile"
	);

	public static final Project CRYPTO002B002B = new Project(
		"crypto++",
		"https://github.com/weidai11/cryptopp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/weidai11/cryptopp/issues",
		".*?(github\\.com\\/weidai11\\/cryptopp\\/issues\\/)([0-9]+)",
		2,
		"C++;Shell;Assembly;C;Makefile;Batchfile"
	);

	public static final Project TCPREPLAY = new Project(
		"tcpreplay",
		"https://github.com/appneta/tcpreplay/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/appneta/tcpreplay/issues",
		".*?(github\\.com\\/appneta\\/tcpreplay\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Makefile;C++;Perl;Roff;Shell"
	);

	public static final Project PHOTOLINE = new Project(
		"photoline",
		"https://github.com/libofx/libofx/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libofx/libofx/issues",
		".*?(github\\.com\\/libofx\\/libofx\\/issues\\/)([0-9]+)",
		2,
		"C++;C;M4;Makefile;Shell;Clean"
	);

	public static final Project UBUNTU_CORE = new Project(
		"ubuntu_core",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project STHTTPD = new Project(
		"sthttpd",
		"https://github.com/blueness/sthttpd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/blueness/sthttpd/issues",
		".*?(github\\.com\\/blueness\\/sthttpd\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Shell;M4;Makefile;Perl;HTML"
	);

	public static final Project LINUX_ENTERPRISE_DEBUGINFO = new Project(
		"linux_enterprise_debuginfo",
		"https://github.com/git/git/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/git/git/issues",
		".*?(github\\.com\\/git\\/git\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Perl;Tcl;Python;Makefile;C++;JavaScript;M4;Roff;Go;sed;CSS;Objective-C;PHP;Assembly;EmacsLisp"
	);

	public static final Project NIXOS = new Project(
		"nixos",
		"https://github.com/NixOS/nixpkgs/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/NixOS/nixpkgs/issues",
		".*?(github\\.com\\/NixOS\\/nixpkgs\\/issues\\/)([0-9]+)",
		2,
		"Nix;Shell;Ruby;Perl;Python;C;CommonLisp;XSLT;Erlang;Vimscript;M4;D;R;EmacsLisp;CSS;QMake;C#;JavaScript;Crystal;Makefile;Roff;sed;Awk;Java;Go;CMake;PHP;PureScript;Meson;Scheme;C++"
	);

	public static final Project UWSGI = new Project(
		"uwsgi",
		"https://github.com/unbit/uwsgi/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/unbit/uwsgi/issues",
		".*?(github\\.com\\/unbit\\/uwsgi\\/issues\\/)([0-9]+)",
		2,
		"C;Python;C++;Perl;Ruby;Java;C#;Go;Lua;Shell;Clojure;Objective-C;HTML;Perl6;Makefile;Erlang;XSLT;PHP;ASP"
	);

	public static final Project PYFRIBIDI = new Project(
		"pyfribidi",
		"https://github.com/pediapress/pyfribidi/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/pediapress/pyfribidi/issues",
		".*?(github\\.com\\/pediapress\\/pyfribidi\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile;Roff;Python;C++;M4"
	);

	public static final Project COCKPIT = new Project(
		"cockpit",
		"https://github.com/cockpit-project/cockpit/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/cockpit-project/cockpit/issues",
		".*?(github\\.com\\/cockpit-project\\/cockpit\\/issues\\/)([0-9]+)",
		2,
		"JavaScript;C;Python;HTML;CSS;Shell;Makefile;Go;M4;C++;Dockerfile;sed;Roff"
	);

	public static final Project POLARSSL = new Project(
		"polarssl",
		"https://github.com/polarssl/polarssl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/polarssl/polarssl/issues",
		".*?(github\\.com\\/polarssl\\/polarssl\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Python;C++;Makefile;Perl;CMake;GDB;Tcl;Groovy"
	);

	public static final Project YARA = new Project(
		"yara",
		"https://github.com/VirusTotal/yara/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/VirusTotal/yara/issues",
		".*?(github\\.com\\/VirusTotal\\/yara\\/issues\\/)([0-9]+)",
		2,
		"C;Yacc;Lex;C++;M4;Python;Makefile;Roff;Objective-C;JavaScript;YARA;HTML;Shell"
	);

	public static final Project NTOPNG = new Project(
		"ntopng",
		"https://github.com/ntop/ntopng/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ntop/ntopng/issues",
		".*?(github\\.com\\/ntop\\/ntopng\\/issues\\/)([0-9]+)",
		2,
		"Lua;C++;JavaScript;C;CSS;Shell;PHP;Makefile;HTML;Roff;Python;Ruby;Dockerfile"
	);

	public static final Project OPENSSH = new Project(
		"openssh",
		"https://github.com/openbsd/src/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/openbsd/src/issues",
		".*?(github\\.com\\/openbsd\\/src\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Perl;HTML;Roff;Objective-C;GCCMachineDescription;Makefile;Python;Shell;Assembly;Yacc;Perl6;Scheme;TeX;M4;XS;CMake;Logos;Scala;Fortran;Lex;OCaml;DIGITALCommandLanguage;Go;Prolog;Awk;PLSQL;CSS;RPC;sed;EmacsLisp;Scilab;JavaScript;Batchfile;GAP;1CEnterprise;C#;Vimscript;Forth;Objective-C++;Pascal;MATLAB;Gnuplot;Mathematica;Ruby;Dockerfile;Smarty;Turing;SuperCollider;Pawn;KRL;XSLT;eC;SAS;Ada;PHP;R;Java;EmberScript;ModuleManagementSystem;AppleScript;GDB;Rebol;DTrace;StandardML;Lua;Terra"
	);

	public static final Project OPENSSH_1 = new Project(
		"openssh",
		"https://github.com/openssh/openssh-portable/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/openssh/openssh-portable/issues",
		".*?(github\\.com\\/openssh\\/openssh-portable\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Roff;M4;Makefile;C++;Awk;KRL"
	);

	public static final Project UA__NET_LEGACY = new Project(
		"ua-.net-legacy",
		"https://github.com/OPCFoundation/UA-.NETStandard/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/OPCFoundation/UA-.NETStandard/issues",
		".*?(github\\.com\\/OPCFoundation\\/UA-.NETStandard\\/issues\\/)([0-9]+)",
		2,
		"C#;C;C++;Smalltalk;TSQL;Batchfile;Shell;Dockerfile"
	);

	public static final Project UA__NET_LEGACY_1 = new Project(
		"ua-.net-legacy",
		"https://github.com/OPCFoundation/UA-.NET-Legacy/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/OPCFoundation/UA-.NET-Legacy/issues",
		".*?(github\\.com\\/OPCFoundation\\/UA-.NET-Legacy\\/issues\\/)([0-9]+)",
		2,
		"C#;HTML;C;C++;JavaScript;Smalltalk;CSS;ASP;Batchfile;Brightscript"
	);

	public static final Project OPENSSL = new Project(
		"openssl",
		"https://github.com/ruby/openssl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ruby/openssl/issues",
		".*?(github\\.com\\/ruby\\/openssl\\/issues\\/)([0-9]+)",
		2,
		"C;Ruby;C++;Shell;Dockerfile"
	);

	public static final Project OPENSSL_1 = new Project(
		"openssl",
		"https://github.com/openssl/openssl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/openssl/openssl/issues",
		".*?(github\\.com\\/openssl\\/openssl\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;C++;Assembly;Objective-C;Shell;M4;eC;DIGITALCommandLanguage;Python"
	);

	public static final Project LIBARCHIVE = new Project(
		"libarchive",
		"https://github.com/libarchive/libarchive/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libarchive/libarchive/issues",
		".*?(github\\.com\\/libarchive\\/libarchive\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;CMake;M4;Objective-C;Makefile;Shell;Batchfile;C++"
	);

	public static final Project LIBRAW_DEMOSAIC_PACK_GPL2 = new Project(
		"libraw-demosaic-pack-gpl2",
		"https://github.com/LibRaw/LibRaw-demosaic-pack-GPL2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/LibRaw/LibRaw-demosaic-pack-GPL2/issues",
		".*?(github\\.com\\/LibRaw\\/LibRaw-demosaic-pack-GPL2\\/issues\\/)([0-9]+)",
		2,
		"C;C++"
	);

	public static final Project DOLIBARR_ERP002FCRM = new Project(
		"dolibarr_erp/crm",
		"https://github.com/Dolibarr/dolibarr/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Dolibarr/dolibarr/issues",
		".*?(github\\.com\\/Dolibarr\\/dolibarr\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;TSQL;CSS;HTML;SQLPL;Perl;Shell;InnoSetup;PLpgSQL;C;Python;Perl6;Makefile;C++;Hack;Dockerfile;Batchfile"
	);

	public static final Project ROUNDCUBE_WEBMAIL = new Project(
		"roundcube_webmail",
		"https://github.com/roundcube/roundcubemail/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/roundcube/roundcubemail/issues",
		".*?(github\\.com\\/roundcube\\/roundcubemail\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;CSS;HTML;TSQL;PLSQL;Shell;Perl;C;Python"
	);

	public static final Project HARFBUZZ = new Project(
		"harfbuzz",
		"https://github.com/behdad/harfbuzz/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/behdad/harfbuzz/issues",
		".*?(github\\.com\\/behdad\\/harfbuzz\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Python;M4;Makefile;CMake;Ragel;Shell"
	);

	public static final Project LIBBSON = new Project(
		"libbson",
		"https://github.com/mongodb/mongo-c-driver/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mongodb/mongo-c-driver/issues",
		".*?(github\\.com\\/mongodb\\/mongo-c-driver\\/issues\\/)([0-9]+)",
		2,
		"C;Python;C++;CMake;Assembly;Shell;Ada;Pascal;C#;Objective-C;HTML;DIGITALCommandLanguage;Batchfile;Makefile;Roff;GDB;CSS;Perl;SAS;ModuleManagementSystem;M4"
	);

	public static final Project THE_SLEUTH_KIT = new Project(
		"the_sleuth_kit",
		"https://github.com/sleuthkit/sleuthkit/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/sleuthkit/sleuthkit/issues",
		".*?(github\\.com\\/sleuthkit\\/sleuthkit\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Shell;Java;M4;Roff;Makefile;Perl;Python;HTML;Objective-C;Batchfile;sed"
	);

	public static final Project BIONIC = new Project(
		"bionic",
		"https://github.com/android/platform_bionic/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/android/platform_bionic/issues",
		".*?(github\\.com\\/android\\/platform_bionic\\/issues\\/)([0-9]+)",
		2,
		"Objective-C;C;C++;Assembly;Python;Makefile;Shell;Perl"
	);

	public static final Project CUPS = new Project(
		"cups",
		"https://github.com/apple/cups/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/apple/cups/issues",
		".*?(github\\.com\\/apple\\/cups\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Makefile;M4;Shell;Roff;Objective-C;HTML;PostScript;Batchfile"
	);

	public static final Project STORAGE_PERFORMANCE_DEVELOPMENT_KIT = new Project(
		"storage_performance_development_kit",
		"https://github.com/spdk/spdk/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/spdk/spdk/issues",
		".*?(github\\.com\\/spdk\\/spdk\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Shell;Makefile;C++;Ruby;Perl;PowerShell;Go;Objective-C"
	);

	public static final Project GOAHEAD = new Project(
		"goahead",
		"https://github.com/embedthis/goahead/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/embedthis/goahead/issues",
		".*?(github\\.com\\/embedthis\\/goahead\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;HTML;Roff;Shell;JavaScript;Scilab;Batchfile;InnoSetup;Python;TypeScript;Perl;ASP"
	);

	public static final Project MINIUPNP = new Project(
		"miniupnp",
		"https://github.com/miniupnp/miniupnp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/miniupnp/miniupnp/issues",
		".*?(github\\.com\\/miniupnp\\/miniupnp\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile;Python;CMake;Roff;Java;VisualBasic;Ruby;Batchfile"
	);

	public static final Project TOR = new Project(
		"tor",
		"https://github.com/torproject/tor/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torproject/tor/issues",
		".*?(github\\.com\\/torproject\\/tor\\/issues\\/)([0-9]+)",
		2,
		"C;Objective-C;C++;Python;Rust;M4;Shell;Makefile;Perl;HTML;q;PHP;Lua;Ruby;Gnuplot"
	);

	public static final Project LIBPLIST = new Project(
		"libplist",
		"https://github.com/libimobiledevice/libplist/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libimobiledevice/libplist/issues",
		".*?(github\\.com\\/libimobiledevice\\/libplist\\/issues\\/)([0-9]+)",
		2,
		"C;C++;M4;Python;Shell;Makefile"
	);

	public static final Project OPENWHISK = new Project(
		"openwhisk",
		"https://github.com/apache/incubator-openwhisk-runtime-docker/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/apache/incubator-openwhisk-runtime-docker/issues",
		".*?(github\\.com\\/apache\\/incubator-openwhisk-runtime-docker\\/issues\\/)([0-9]+)",
		2,
		"Scala;Python;Shell;Dockerfile;C"
	);

	public static final Project ZEROMQ = new Project(
		"zeromq",
		"https://github.com/zeromq/zeromq4-x/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/zeromq/zeromq4-x/issues",
		".*?(github\\.com\\/zeromq\\/zeromq4-x\\/issues\\/)([0-9]+)",
		2,
		"C++;M4;CMake;C;Shell;Makefile"
	);

	public static final Project ROUTER_ADVERTISEMENT_DAEMON = new Project(
		"router_advertisement_daemon",
		"https://github.com/reubenhwk/radvd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/reubenhwk/radvd/issues",
		".*?(github\\.com\\/reubenhwk\\/radvd\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;Shell;Yacc;M4;Makefile;Lex;HTML;Perl"
	);

	public static final Project KIWI = new Project(
		"kiwi",
		"https://github.com/openSUSE/kiwi/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/openSUSE/kiwi/issues",
		".*?(github\\.com\\/openSUSE\\/kiwi\\/issues\\/)([0-9]+)",
		2,
		"Perl;Shell;XSLT;JavaScript;C;Makefile;Assembly;CSS;Ruby;EmacsLisp"
	);

	public static final Project CIVETWEB = new Project(
		"civetweb",
		"https://github.com/civetweb/civetweb/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/civetweb/civetweb/issues",
		".*?(github\\.com\\/civetweb\\/civetweb\\/issues\\/)([0-9]+)",
		2,
		"C;Lua;CMake;Batchfile;HTML;C++;Perl;Makefile;Shell;JavaScript;Python;QMake;CSS;PHP"
	);

	public static final Project LIGHTTPD = new Project(
		"lighttpd",
		"https://github.com/lighttpd/lighttpd1.4/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/lighttpd/lighttpd1.4/issues",
		".*?(github\\.com\\/lighttpd\\/lighttpd1.4\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;M4;CMake;Meson;Python;Yacc;Makefile;Shell;HTML;Objective-C;PHP;C++"
	);

	public static final Project U_BOOT = new Project(
		"u-boot",
		"https://github.com/u-boot/u-boot/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/u-boot/u-boot/issues",
		".*?(github\\.com\\/u-boot\\/u-boot\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Assembly;Makefile;Objective-C;Perl;Shell;Yacc;HTML;Lex;Batchfile;GDB;sed;CSS;Tcl;Awk"
	);

	public static final Project LIBREPORT = new Project(
		"libreport",
		"https://github.com/abrt/libreport/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/abrt/libreport/issues",
		".*?(github\\.com\\/abrt\\/libreport\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Makefile;C++;M4;Shell;Augeas;EmacsLisp"
	);

	public static final Project RUBY_FFI = new Project(
		"ruby-ffi",
		"https://github.com/ffi/ffi/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ffi/ffi/issues",
		".*?(github\\.com\\/ffi\\/ffi\\/issues\\/)([0-9]+)",
		2,
		"Ruby;C;Makefile;Shell"
	);

	public static final Project LIBEVENT = new Project(
		"libevent",
		"https://github.com/libevent/libevent/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libevent/libevent/issues",
		".*?(github\\.com\\/libevent\\/libevent\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Python;C++;Roff;M4;Shell;Makefile;sed"
	);

	public static final Project WINSCP = new Project(
		"winscp",
		"https://github.com/winscp/winscp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/winscp/winscp/issues",
		".*?(github\\.com\\/winscp\\/winscp\\/issues\\/)([0-9]+)",
		2,
		"C++;Pascal;C#;C;InnoSetup;Batchfile"
	);

	public static final Project FFMPEG = new Project(
		"ffmpeg",
		"https://github.com/FFmpeg/FFmpeg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/FFmpeg/FFmpeg/issues",
		".*?(github\\.com\\/FFmpeg\\/FFmpeg\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;Objective-C;Makefile;C++;Shell;Cuda;Perl;Awk;Python;HTML;Ruby;Verilog;Roff"
	);

	public static final Project RDESKTOP = new Project(
		"rdesktop",
		"https://github.com/rdesktop/rdesktop/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/rdesktop/rdesktop/issues",
		".*?(github\\.com\\/rdesktop\\/rdesktop\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Objective-C;Makefile;Shell;Python;C++"
	);

	public static final Project LIBPNG = new Project(
		"libpng",
		"https://github.com/glennrp/libpng/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/glennrp/libpng/issues",
		".*?(github\\.com\\/glennrp\\/libpng\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Roff;Makefile;CMake;Awk;M4;C++;DIGITALCommandLanguage;Objective-C;Assembly;Batchfile;ModuleManagementSystem;Dockerfile"
	);

	public static final Project PHUSION_PASSENGER = new Project(
		"phusion_passenger",
		"https://github.com/phusion/passenger/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/phusion/passenger/issues",
		".*?(github\\.com\\/phusion\\/passenger\\/issues\\/)([0-9]+)",
		2,
		"C++;Ruby;C;Shell;Makefile;JavaScript;Python;HTML;M4;Objective-C;Groovy;CSS;Perl;Batchfile"
	);

	public static final Project LINUX_ENTERPRISE_SERVER = new Project(
		"linux_enterprise_server",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project NUCLIDE = new Project(
		"nuclide",
		"https://github.com/facebook/nuclide/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/facebook/nuclide/issues",
		".*?(github\\.com\\/facebook\\/nuclide\\/issues\\/)([0-9]+)",
		2,
		"JavaScript;Python;Java;CSS;C++;Shell;Hack;C;CoffeeScript;Thrift;HTML;Makefile;OCaml;Objective-C;Batchfile;PHP"
	);

	public static final Project CEPH = new Project(
		"ceph",
		"https://github.com/ceph/ceph/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ceph/ceph/issues",
		".*?(github\\.com\\/ceph\\/ceph\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;Terra;Shell;TypeScript;C;CMake;Perl;HTML;JavaScript;Java;Assembly;Perl6;CSS;Roff;Ruby;DIGITALCommandLanguage;Lua;Makefile;Dockerfile"
	);

	public static final Project SUHOSIN = new Project(
		"suhosin",
		"https://github.com/stefanesser/suhosin/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/stefanesser/suhosin/issues",
		".*?(github\\.com\\/stefanesser\\/suhosin\\/issues\\/)([0-9]+)",
		2,
		"C;PHP;Shell;M4;JavaScript"
	);

	public static final Project WEECHAT = new Project(
		"weechat",
		"https://github.com/weechat/weechat/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/weechat/weechat/issues",
		".*?(github\\.com\\/weechat\\/weechat\\/issues\\/)([0-9]+)",
		2,
		"C;C++;CMake;M4;Python;Makefile;Shell"
	);

	public static final Project WAVPACK = new Project(
		"wavpack",
		"https://github.com/dbry/WavPack/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dbry/WavPack/issues",
		".*?(github\\.com\\/dbry\\/WavPack\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;C++;Objective-C;CMake;M4;NSIS;Makefile;Shell"
	);

	public static final Project B2EVOLUTION = new Project(
		"b2evolution",
		"https://github.com/b2evolution/b2evolution/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/b2evolution/b2evolution/issues",
		".*?(github\\.com\\/b2evolution\\/b2evolution\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;CSS;HTML;Pascal;C;Shell;M4"
	);

	public static final Project IPPUSBXD = new Project(
		"ippusbxd",
		"https://github.com/tillkamppeter/ippusbxd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/tillkamppeter/ippusbxd/issues",
		".*?(github\\.com\\/tillkamppeter\\/ippusbxd\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Makefile"
	);

	public static final Project LIBXSMM = new Project(
		"libxsmm",
		"https://github.com/hfp/libxsmm/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/hfp/libxsmm/issues",
		".*?(github\\.com\\/hfp\\/libxsmm\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Makefile;Fortran;Shell;Python;Batchfile;JavaScript;HTML;CSS"
	);

	public static final Project EDGE = new Project(
		"edge",
		"https://github.com/Microsoft/ChakraCore/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Microsoft/ChakraCore/issues",
		".*?(github\\.com\\/Microsoft\\/ChakraCore\\/issues\\/)([0-9]+)",
		2,
		"JavaScript;C++;WebAssembly;Objective-C;C;Assembly;Roff;Batchfile;Python;CMake;Shell;PowerShell;Perl;Groovy;CSS;Pawn"
	);

	public static final Project OPENSHIFT = new Project(
		"openshift",
		"https://github.com/openshift/origin-server/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/openshift/origin-server/issues",
		".*?(github\\.com\\/openshift\\/origin-server\\/issues\\/)([0-9]+)",
		2,
		"Ruby;HTML;Python;Shell;CSS;Roff;Gherkin;JavaScript;PHP;C;ApacheConf;Perl;Go;PLSQL;Java;CoffeeScript;Makefile;Vimscript"
	);

	public static final Project JPEGSNOOP = new Project(
		"jpegsnoop",
		"https://github.com/ImpulseAdventure/JPEGsnoop/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ImpulseAdventure/JPEGsnoop/issues",
		".*?(github\\.com\\/ImpulseAdventure\\/JPEGsnoop\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Makefile"
	);

	public static final Project MOSH = new Project(
		"mosh",
		"https://github.com/keithw/mosh/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/keithw/mosh/issues",
		".*?(github\\.com\\/keithw\\/mosh\\/issues\\/)([0-9]+)",
		2,
		"C++;M4;Shell;C;Perl;Makefile;HTML"
	);

	public static final Project GRAPHICSMAGICK = new Project(
		"graphicsmagick",
		"https://github.com/ImageMagick/ImageMagick/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ImageMagick/ImageMagick/issues",
		".*?(github\\.com\\/ImageMagick\\/ImageMagick\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Makefile;C++;XS;Shell;M4;Perl;Roff;CSS;Objective-C;Tcl;DIGITALCommandLanguage"
	);

	public static final Project UBUNTU_LINUX = new Project(
		"ubuntu_linux",
		"https://github.com/mysql/mysql-server/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mysql/mysql-server/issues",
		".*?(github\\.com\\/mysql\\/mysql-server\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;C;Objective-C;Java;CSS;PHP;CMake;HTML;Perl;SQLPL;Assembly;Yacc;Python;Shell;PLpgSQL;Makefile;Pascal;SourcePawn;Roff;XSLT;DIGITALCommandLanguage;ActionScript;Lex;RPC;M4;Awk;POV-RaySDL;AngelScript;Batchfile;SAS;ModuleManagementSystem;sed;VisualBasic;PLSQL"
	);

	public static final Project UBUNTU_LINUX_1 = new Project(
		"ubuntu_linux",
		"https://github.com/lxc/lxcfs/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/lxc/lxcfs/issues",
		".*?(github\\.com\\/lxc\\/lxcfs\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;Makefile"
	);

	public static final Project UBUNTU_LINUX_2 = new Project(
		"ubuntu_linux",
		"https://github.com/jmacd/xdelta-devel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jmacd/xdelta-devel/issues",
		".*?(github\\.com\\/jmacd\\/xdelta-devel\\/issues\\/)([0-9]+)",
		2,
		"C;C++;EmacsLisp;Python;M4;Go;Makefile;Objective-C;Groff;Shell;CMake"
	);

	public static final Project UBUNTU_LINUX_3 = new Project(
		"ubuntu_linux",
		"https://github.com/hexchat/hexchat/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/hexchat/hexchat/issues",
		".*?(github\\.com\\/hexchat\\/hexchat\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Perl;Meson;C#;C++;Objective-C;Shell;InnoSetup;Batchfile;PowerShell"
	);

	public static final Project UBUNTU_LINUX_4 = new Project(
		"ubuntu_linux",
		"https://github.com/quassel/quassel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/quassel/quassel/issues",
		".*?(github\\.com\\/quassel\\/quassel\\/issues\\/)([0-9]+)",
		2,
		"C++;Perl;CMake;Python;Shell;Objective-C++;PLpgSQL;C;PLSQL"
	);

	public static final Project UBUNTU_LINUX_5 = new Project(
		"ubuntu_linux",
		"https://github.com/dosfstools/dosfstools/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dosfstools/dosfstools/issues",
		".*?(github\\.com\\/dosfstools\\/dosfstools\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;Makefile;Shell;M4;C++"
	);

	public static final Project UBUNTU_LINUX_6 = new Project(
		"ubuntu_linux",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project UBUNTU_LINUX_7 = new Project(
		"ubuntu_linux",
		"https://github.com/vrtadmin/clamav-devel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/vrtadmin/clamav-devel/issues",
		".*?(github\\.com\\/vrtadmin\\/clamav-devel\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Makefile;Shell;M4;Python;Perl;CMake;Objective-C;Yacc;HTML;RichTextFormat;Lex;InnoSetup;Vimscript;EmacsLisp;Gnuplot;Pawn;JavaScript;Assembly;LLVM;GDB;Batchfile"
	);

	public static final Project UBUNTU_LINUX_8 = new Project(
		"ubuntu_linux",
		"https://github.com/LibRaw/LibRaw/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/LibRaw/LibRaw/issues",
		".*?(github\\.com\\/LibRaw\\/LibRaw\\/issues\\/)([0-9]+)",
		2,
		"C++;C;HTML;M4;Perl;QMake;Makefile;Shell;Batchfile;GDB"
	);

	public static final Project UBUNTU_LINUX_9 = new Project(
		"ubuntu_linux",
		"https://github.com/GNOME/pango/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/pango/issues",
		".*?(github\\.com\\/GNOME\\/pango\\/issues\\/)([0-9]+)",
		2,
		"C;Objective-C;Meson;C++;Python;Ragel;Perl;Shell"
	);

	public static final Project UBUNTU_LINUX_10 = new Project(
		"ubuntu_linux",
		"https://github.com/systemd/systemd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/systemd/systemd/issues",
		".*?(github\\.com\\/systemd\\/systemd\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Shell;Meson;HTML;Perl;C++;M4;Objective-C;Awk;EmacsLisp;Dockerfile;Vimscript;Makefile;sed"
	);

	public static final Project UBUNTU_LINUX_11 = new Project(
		"ubuntu_linux",
		"https://github.com/apache/httpd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/apache/httpd/issues",
		".*?(github\\.com\\/apache\\/httpd\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;CMake;Makefile;Awk;C++;Python;Perl;GDB;Lex;Lua;DTrace;Yacc;Perl6;SourcePawn;PHP"
	);

	public static final Project UBUNTU_LINUX_12 = new Project(
		"ubuntu_linux",
		"https://github.com/neomutt/neomutt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/neomutt/neomutt/issues",
		".*?(github\\.com\\/neomutt\\/neomutt\\/issues\\/)([0-9]+)",
		2,
		"C;Tcl;Shell;Perl;CSS;HTML;Lua;Roff;Python;Scheme"
	);

	public static final Project UBUNTU_LINUX_13 = new Project(
		"ubuntu_linux",
		"https://github.com/kohler/t1utils/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kohler/t1utils/issues",
		".*?(github\\.com\\/kohler\\/t1utils\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;M4;Makefile;Shell"
	);

	public static final Project ENTERPRISE_LINUX_HIGH_AVAILABILITY = new Project(
		"enterprise_linux_high_availability",
		"https://github.com/ClusterLabs/pacemaker/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ClusterLabs/pacemaker/issues",
		".*?(github\\.com\\/ClusterLabs\\/pacemaker\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Shell;XSLT;M4;Makefile;Roff;C++"
	);

	public static final Project QUAGGA = new Project(
		"quagga",
		"https://github.com/Quagga/quagga/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Quagga/quagga/issues",
		".*?(github\\.com\\/Quagga\\/quagga\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;Makefile;Python;C++;Lua;Perl;CommonLisp;Awk"
	);

	public static final Project VM_SERVER = new Project(
		"vm_server",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project SWOOLE = new Project(
		"swoole",
		"https://github.com/swoole/swoole-src/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/swoole/swoole-src/issues",
		".*?(github\\.com\\/swoole\\/swoole-src\\/issues\\/)([0-9]+)",
		2,
		"C++;PHP;C;M4;Shell;Go;PLpgSQL;CMake;Python;JavaScript"
	);

	public static final Project ZFS = new Project(
		"zfs",
		"https://github.com/FransUrbo/zfs/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/FransUrbo/zfs/issues",
		".*?(github\\.com\\/FransUrbo\\/zfs\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Assembly;M4;Makefile;Python;C++;Perl;Roff;Awk"
	);

	public static final Project ZFS_1 = new Project(
		"zfs",
		"https://github.com/zfsonlinux/zfs/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/zfsonlinux/zfs/issues",
		".*?(github\\.com\\/zfsonlinux\\/zfs\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Python;M4;Assembly;Makefile;C++;Lua;Perl;Roff;sed;Awk"
	);

	public static final Project H2O = new Project(
		"h2o",
		"https://github.com/h2o/h2o/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/h2o/h2o/issues",
		".*?(github\\.com\\/h2o\\/h2o\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;Mathematica;Objective-C;Ruby;Shell;CMake;Python;C++;PHP;Makefile;HTML;Dockerfile;Vimscript;JavaScript"
	);

	public static final Project GNOME_SESSION = new Project(
		"gnome-session",
		"https://github.com/GNOME/gnome-session/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/gnome-session/issues",
		".*?(github\\.com\\/GNOME\\/gnome-session\\/issues\\/)([0-9]+)",
		2,
		"C;Meson;Python;Shell"
	);

	public static final Project SALT = new Project(
		"salt",
		"https://github.com/saltstack/salt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/saltstack/salt/issues",
		".*?(github\\.com\\/saltstack\\/salt\\/issues\\/)([0-9]+)",
		2,
		"Python;Shell;Groovy;SaltStack;NSIS;Batchfile;PowerShell;HTML;TSQL;Scheme;RichTextFormat;Ruby;Makefile;C;Roff;Dockerfile;HCL"
	);

	public static final Project EPESI = new Project(
		"epesi",
		"https://github.com/Telaxus/EPESI/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Telaxus/EPESI/issues",
		".*?(github\\.com\\/Telaxus\\/EPESI\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;CSS;HTML;Smarty;PLSQL;Perl;C;Python"
	);

	public static final Project LIBGIT2 = new Project(
		"libgit2",
		"https://github.com/libgit2/libgit2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libgit2/libgit2/issues",
		".*?(github\\.com\\/libgit2\\/libgit2\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;C++;Shell;Python;PHP;PowerShell;HTML;Objective-C"
	);

	public static final Project OPENMEDIAVAULT = new Project(
		"openmediavault",
		"https://github.com/openmediavault/openmediavault/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/openmediavault/openmediavault/issues",
		".*?(github\\.com\\/openmediavault\\/openmediavault\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;Python;SaltStack;Shell;CSS;Makefile;C;XSLT;Perl;Scheme;Ruby;M4"
	);

	public static final Project KEEPALIVED = new Project(
		"keepalived",
		"https://github.com/acassen/keepalived/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/acassen/keepalived/issues",
		".*?(github\\.com\\/acassen\\/keepalived\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;Makefile;Python;Perl;C++;Objective-C;Dockerfile"
	);

	public static final Project MODSECURITY = new Project(
		"modsecurity",
		"https://github.com/SpiderLabs/ModSecurity/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/SpiderLabs/ModSecurity/issues",
		".*?(github\\.com\\/SpiderLabs\\/ModSecurity\\/issues\\/)([0-9]+)",
		2,
		"C++;C;M4;Makefile;Shell;Lua"
	);

	public static final Project NODE_JS = new Project(
		"node.js",
		"https://github.com/nodejs/node/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/nodejs/node/issues",
		".*?(github\\.com\\/nodejs\\/node\\/issues\\/)([0-9]+)",
		2,
		"JavaScript;C++;Python;C;HTML;Makefile;Batchfile;DTrace;Shell;EmacsLisp;Perl;Roff;R"
	);

	public static final Project NGIFLIB = new Project(
		"ngiflib",
		"https://github.com/miniupnp/ngiflib/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/miniupnp/ngiflib/issues",
		".*?(github\\.com\\/miniupnp\\/ngiflib\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile"
	);

	public static final Project ILLUMOS = new Project(
		"illumos",
		"https://github.com/illumos/illumos-gate/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/illumos/illumos-gate/issues",
		".*?(github\\.com\\/illumos\\/illumos-gate\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Objective-C;Roff;Makefile;Assembly;Shell;Java;DTrace;DIGITALCommandLanguage;Perl;Yacc;PHP;Forth;RPC;HTML;M4;Lex;TeX;Python;XS;Awk;PostScript;Tcl;Scheme;Batchfile;D;sed;SourcePawn;RenderScript;Logos;IGORPro;Harbour;Scilab"
	);

	public static final Project JUNOS_SPACE = new Project(
		"junos_space",
		"https://github.com/OpenNMS/opennms/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/OpenNMS/opennms/issues",
		".*?(github\\.com\\/OpenNMS\\/opennms\\/issues\\/)([0-9]+)",
		2,
		"Java;JavaScript;HTML;Shell;CSS;Groovy;PLpgSQL;Perl;XSLT;NSIS;M4;FreeMarker;Python;C++;Makefile;Batchfile;Dockerfile;C;Smarty;TSQL;TypeScript;R;AspectJ;CMake;Clojure;Ruby"
	);

	public static final Project XEN = new Project(
		"xen",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project DBD_MYSQL = new Project(
		"dbd-mysql",
		"https://github.com/perl5-dbi/DBD-mysql/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/perl5-dbi/DBD-mysql/issues",
		".*?(github\\.com\\/perl5-dbi\\/DBD-mysql\\/issues\\/)([0-9]+)",
		2,
		"Perl;C;Objective-C"
	);

	public static final Project CRYPTOGRAPHY = new Project(
		"cryptography",
		"https://github.com/pyca/cryptography/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/pyca/cryptography/issues",
		".*?(github\\.com\\/pyca\\/cryptography\\/issues\\/)([0-9]+)",
		2,
		"Python;C;Shell"
	);

	public static final Project GARBAGE_COLLECTOR = new Project(
		"garbage_collector",
		"https://github.com/ivmai/bdwgc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ivmai/bdwgc/issues",
		".*?(github\\.com\\/ivmai\\/bdwgc\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Makefile;M4;CMake;Assembly;Shell;Batchfile"
	);

	public static final Project OPENSUSE = new Project(
		"opensuse",
		"https://github.com/libguestfs/hivex/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libguestfs/hivex/issues",
		".*?(github\\.com\\/libguestfs\\/hivex\\/issues\\/)([0-9]+)",
		2,
		"OCaml;C;Perl;M4;Makefile;Shell;Ruby;Python;CSS;HTML"
	);

	public static final Project OPENSUSE_1 = new Project(
		"opensuse",
		"https://github.com/php/php-src/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/php/php-src/issues",
		".*?(github\\.com\\/php\\/php-src\\/issues\\/)([0-9]+)",
		2,
		"C;PHP;C++;M4;Shell;Objective-C;Lua;JavaScript;Lex;Yacc;Makefile;GAP;GDB;Perl;Batchfile;XSLT;DTrace;Awk;HTML"
	);

	public static final Project OPENSUSE_2 = new Project(
		"opensuse",
		"https://github.com/systemd/systemd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/systemd/systemd/issues",
		".*?(github\\.com\\/systemd\\/systemd\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Shell;Meson;HTML;Perl;C++;M4;Objective-C;Awk;EmacsLisp;Dockerfile;Vimscript;Makefile;sed"
	);

	public static final Project OPENSUSE_3 = new Project(
		"opensuse",
		"https://github.com/erikd/libsndfile/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/erikd/libsndfile/issues",
		".*?(github\\.com\\/erikd\\/libsndfile\\/issues\\/)([0-9]+)",
		2,
		"C;Smarty;CMake;M4;Python;C++;Shell;Makefile;M;MATLAB"
	);

	public static final Project OPENSUSE_4 = new Project(
		"opensuse",
		"https://github.com/karelzak/util-linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/karelzak/util-linux/issues",
		".*?(github\\.com\\/karelzak\\/util-linux\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;Shell;M4;Yacc;Makefile;Python;Perl"
	);

	public static final Project OPENSUSE_5 = new Project(
		"opensuse",
		"https://github.com/karelzak/util-linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/karelzak/util-linux/issues",
		".*?(github\\.com\\/karelzak\\/util-linux\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;Shell;M4;Yacc;Makefile;Python;Perl"
	);

	public static final Project NETTY = new Project(
		"netty",
		"https://github.com/netty/netty/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/netty/netty/issues",
		".*?(github\\.com\\/netty\\/netty\\/issues\\/)([0-9]+)",
		2,
		"Java;C;Shell;Groovy;C++;Makefile;HTML;CSS"
	);

	public static final Project SURICATA = new Project(
		"suricata",
		"https://github.com/OISF/suricata/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/OISF/suricata/issues",
		".*?(github\\.com\\/OISF\\/suricata\\/issues\\/)([0-9]+)",
		2,
		"C;Rust;M4;Python;C++;Perl;Makefile;Shell;Lua;Objective-C"
	);

	public static final Project SURICATA_1 = new Project(
		"suricata",
		"https://github.com/inliniac/suricata/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/inliniac/suricata/issues",
		".*?(github\\.com\\/inliniac\\/suricata\\/issues\\/)([0-9]+)",
		2,
		"C;Rust;M4;Python;C++;Perl;Makefile;Shell;Lua;Objective-C"
	);

	public static final Project ZRTPCPP = new Project(
		"zrtpcpp",
		"https://github.com/wernerd/ZRTPCPP/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/wernerd/ZRTPCPP/issues",
		".*?(github\\.com\\/wernerd\\/ZRTPCPP\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Objective-C;CMake;Java;Makefile;Shell"
	);

	public static final Project FLATPAK = new Project(
		"flatpak",
		"https://github.com/flatpak/flatpak/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/flatpak/flatpak/issues",
		".*?(github\\.com\\/flatpak\\/flatpak\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;Yacc;Python;PHP;Makefile;C++;Pawn"
	);

	public static final Project FREERADIUS = new Project(
		"freeradius",
		"https://github.com/alandekok/freeradius-server/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/alandekok/freeradius-server/issues",
		".*?(github\\.com\\/alandekok\\/freeradius-server\\/issues\\/)([0-9]+)",
		2,
		"Shell;C;Perl;Python;C++;Objective-C;Ruby"
	);

	public static final Project OPENOFFICE_ORG = new Project(
		"openoffice.org",
		"https://github.com/dajobe/raptor/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dajobe/raptor/issues",
		".*?(github\\.com\\/dajobe\\/raptor\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;HTML;CMake;Makefile;M4;Perl;Yacc;Shell;C++"
	);

	public static final Project JSON_C = new Project(
		"json-c",
		"https://github.com/json-c/json-c/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/json-c/json-c/issues",
		".*?(github\\.com\\/json-c\\/json-c\\/issues\\/)([0-9]+)",
		2,
		"C;M4;CMake;Shell;Makefile;C++"
	);

	public static final Project COLLECTD = new Project(
		"collectd",
		"https://github.com/collectd/collectd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/collectd/collectd/issues",
		".*?(github\\.com\\/collectd\\/collectd\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;M4;PHP;Java;Makefile;C++;JavaScript;Python;Shell;PLpgSQL;Yacc;Lex;Ruby;CSS;Dockerfile"
	);

	public static final Project LIBLOUIS = new Project(
		"liblouis",
		"https://github.com/liblouis/liblouis/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/liblouis/liblouis/issues",
		".*?(github\\.com\\/liblouis\\/liblouis\\/issues\\/)([0-9]+)",
		2,
		"C;M4;C++;Makefile;Python;Shell;EmacsLisp;Perl;XSLT;Go;Dockerfile;PowerShell;Batchfile;Roff"
	);

	public static final Project RADIUS = new Project(
		"radius",
		"https://github.com/LawnGnome/php-radius/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/LawnGnome/php-radius/issues",
		".*?(github\\.com\\/LawnGnome\\/php-radius\\/issues\\/)([0-9]+)",
		2,
		"C;PHP;C++;Shell;JavaScript"
	);

	public static final Project PHP = new Project(
		"php",
		"https://github.com/derickr/timelib/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/derickr/timelib/issues",
		".*?(github\\.com\\/derickr\\/timelib\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Objective-C;PHP;TypeScript;Makefile"
	);

	public static final Project PHP_1 = new Project(
		"php",
		"https://github.com/php/php-src/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/php/php-src/issues",
		".*?(github\\.com\\/php\\/php-src\\/issues\\/)([0-9]+)",
		2,
		"C;PHP;C++;M4;Shell;Objective-C;Lua;JavaScript;Lex;Yacc;Makefile;GAP;GDB;Perl;Batchfile;XSLT;DTrace;Awk;HTML"
	);

	public static final Project PHP_2 = new Project(
		"php",
		"https://github.com/facebook/hhvm/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/facebook/hhvm/issues",
		".*?(github\\.com\\/facebook\\/hhvm\\/issues\\/)([0-9]+)",
		2,
		"C++;Hack;OCaml;Rust;C;PHP;JavaScript;CMake;Python;Yacc;Objective-C;Shell;Assembly;StandardML;Roff;LLVM;XSLT;Perl;GDB;Batchfile;CSS;Makefile;HTML;Awk"
	);

	public static final Project PHP_3 = new Project(
		"php",
		"https://github.com/file/file/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/file/file/issues",
		".*?(github\\.com\\/file\\/file\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;M4;Python;C++;Shell;Dockerfile"
	);

	public static final Project LIBGUESTFS = new Project(
		"libguestfs",
		"https://github.com/libguestfs/libguestfs/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libguestfs/libguestfs/issues",
		".*?(github\\.com\\/libguestfs\\/libguestfs\\/issues\\/)([0-9]+)",
		2,
		"OCaml;C;Shell;Makefile;Perl;M4;Python;StandardML;Java;Ruby;Lua;Go;HTML;Erlang;PHP;C++;CSS;JavaScript;Haskell"
	);

	public static final Project PSI002B = new Project(
		"psi+",
		"https://github.com/psi-im/iris/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/psi-im/iris/issues",
		".*?(github\\.com\\/psi-im\\/iris\\/issues\\/)([0-9]+)",
		2,
		"C++;C;CMake;QMake;Shell"
	);

	public static final Project LIBGD = new Project(
		"libgd",
		"https://github.com/libgd/libgd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libgd/libgd/issues",
		".*?(github\\.com\\/libgd\\/libgd\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Objective-C;C++;M4;HTML;Shell;DIGITALCommandLanguage;Makefile;Perl;Batchfile;Tcl;Python"
	);

	public static final Project LIBGD_1 = new Project(
		"libgd",
		"https://github.com/php/php-src/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/php/php-src/issues",
		".*?(github\\.com\\/php\\/php-src\\/issues\\/)([0-9]+)",
		2,
		"C;PHP;C++;M4;Shell;Objective-C;Lua;JavaScript;Lex;Yacc;Makefile;GAP;GDB;Perl;Batchfile;XSLT;DTrace;Awk;HTML"
	);

	public static final Project APPWEB = new Project(
		"appweb",
		"https://github.com/embedthis/appweb/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/embedthis/appweb/issues",
		".*?(github\\.com\\/embedthis\\/appweb\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Makefile;Scilab;Roff;Shell;JavaScript;InnoSetup;CSS;C++;Batchfile;RichTextFormat;Perl6;Perl;Ruby;TypeScript;Python;PHP"
	);

	public static final Project IMAGEMAGICK = new Project(
		"imagemagick",
		"https://github.com/ImageMagick/ImageMagick6/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ImageMagick/ImageMagick6/issues",
		".*?(github\\.com\\/ImageMagick\\/ImageMagick6\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Makefile;Hack;C++;XS;Shell;M4;Perl;Roff;CSS;Tcl;DIGITALCommandLanguage;Objective-C"
	);

	public static final Project IMAGEMAGICK_1 = new Project(
		"imagemagick",
		"https://github.com/ImageMagick/ImageMagick/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ImageMagick/ImageMagick/issues",
		".*?(github\\.com\\/ImageMagick\\/ImageMagick\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Makefile;C++;XS;Shell;M4;Perl;Roff;CSS;Objective-C;Tcl;DIGITALCommandLanguage"
	);

	public static final Project CLAMAV = new Project(
		"clamav",
		"https://github.com/vrtadmin/clamav-devel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/vrtadmin/clamav-devel/issues",
		".*?(github\\.com\\/vrtadmin\\/clamav-devel\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Makefile;Shell;M4;Python;Perl;CMake;Objective-C;Yacc;HTML;RichTextFormat;Lex;InnoSetup;Vimscript;EmacsLisp;Gnuplot;Pawn;JavaScript;Assembly;LLVM;GDB;Batchfile"
	);

	public static final Project CLAMAV_1 = new Project(
		"clamav",
		"https://github.com/Cisco-Talos/clamav-devel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Cisco-Talos/clamav-devel/issues",
		".*?(github\\.com\\/Cisco-Talos\\/clamav-devel\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Makefile;Shell;M4;Python;Perl;CMake;Objective-C;Yacc;HTML;RichTextFormat;Lex;InnoSetup;Vimscript;EmacsLisp;Gnuplot;Pawn;JavaScript;Assembly;LLVM;GDB;Batchfile"
	);

	public static final Project UNREALIRCD = new Project(
		"unrealircd",
		"https://github.com/unrealircd/unrealircd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/unrealircd/unrealircd/issues",
		".*?(github\\.com\\/unrealircd\\/unrealircd\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;Makefile;RichTextFormat;InnoSetup;Swift;C++;Batchfile"
	);

	public static final Project DOMOTICZ = new Project(
		"domoticz",
		"https://github.com/domoticz/domoticz/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/domoticz/domoticz/issues",
		".*?(github\\.com\\/domoticz\\/domoticz\\/issues\\/)([0-9]+)",
		2,
		"C;C++;JavaScript;HTML;Lua;CSS;Python;CMake;C#;DIGITALCommandLanguage;Shell;Objective-C;Makefile;Roff;InnoSetup;Perl;Batchfile"
	);

	public static final Project HAWTJNI = new Project(
		"hawtjni",
		"https://github.com/fusesource/hawtjni/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/fusesource/hawtjni/issues",
		".*?(github\\.com\\/fusesource\\/hawtjni\\/issues\\/)([0-9]+)",
		2,
		"Java;C;M4;CSS;Scala;HTML;Shell;Objective-C;Makefile"
	);

	public static final Project ESPRUINO = new Project(
		"espruino",
		"https://github.com/espruino/Espruino/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/espruino/Espruino/issues",
		".*?(github\\.com\\/espruino\\/Espruino\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;C++;Python;HTML;JavaScript;RichTextFormat;Makefile;Shell;CMake;CSS;GDB;Batchfile;Dockerfile;Ruby;Tcl"
	);

	public static final Project DOXYGEN = new Project(
		"doxygen",
		"https://github.com/doxygen/doxygen/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/doxygen/doxygen/issues",
		".*?(github\\.com\\/doxygen\\/doxygen\\/issues\\/)([0-9]+)",
		2,
		"C++;Lex;Smarty;JavaScript;CSS;Python;C;CMake;Tcl;TeX;PHP;Perl;Yacc;Makefile;HTML;Objective-C;Fortran;Roff;C#;Java"
	);

	public static final Project MSTDLIB = new Project(
		"mstdlib",
		"https://github.com/Monetra/mstdlib/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Monetra/mstdlib/issues",
		".*?(github\\.com\\/Monetra\\/mstdlib\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Objective-C;M4;C++;Makefile;Shell"
	);

	public static final Project LIBXKBCOMMON = new Project(
		"libxkbcommon",
		"https://github.com/xkbcommon/libxkbcommon/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/xkbcommon/libxkbcommon/issues",
		".*?(github\\.com\\/xkbcommon\\/libxkbcommon\\/issues\\/)([0-9]+)",
		2,
		"C;Yacc;Meson;M4;Makefile;Python;Shell;C++"
	);

	public static final Project PROFANITY = new Project(
		"profanity",
		"https://github.com/boothj5/profanity/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/boothj5/profanity/issues",
		".*?(github\\.com\\/boothj5\\/profanity\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Objective-C;Makefile;M4;C++;Shell"
	);

	public static final Project CGI003AIRC = new Project(
		"cgi:irc",
		"https://github.com/dgl/cgiirc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dgl/cgiirc/issues",
		".*?(github\\.com\\/dgl\\/cgiirc\\/issues\\/)([0-9]+)",
		2,
		"Perl;CSS;C;Perl6"
	);

	public static final Project LIBVTERM = new Project(
		"libvterm",
		"https://github.com/vim/vim/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/vim/vim/issues",
		".*?(github\\.com\\/vim\\/vim\\/issues\\/)([0-9]+)",
		2,
		"Vimscript;C;Roff;Makefile;C++;M4;Objective-C;NSIS;PostScript;Perl;XS;ModuleManagementSystem;NewLisp;Shell;Ruby;EmacsLisp;SystemVerilog;JavaScript;Smalltalk;Python;Awk;DIGITALCommandLanguage;Batchfile;MATLAB;Tcl;HTML;IDL;Prolog"
	);

	public static final Project SUBSCRIPTION_MANAGER = new Project(
		"subscription-manager",
		"https://github.com/candlepin/subscription-manager/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/candlepin/subscription-manager/issues",
		".*?(github\\.com\\/candlepin\\/subscription-manager\\/issues\\/)([0-9]+)",
		2,
		"Python;C;JavaScript;Shell;Makefile;CSS;Roff;CMake;HTML"
	);

	public static final Project BROWSER = new Project(
		"browser",
		"https://github.com/paritytech/parity/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/paritytech/parity/issues",
		".*?(github\\.com\\/paritytech\\/parity\\/issues\\/)([0-9]+)",
		2,
		"Rust;Shell;C;Java;Dockerfile;C++;CMake;Batchfile"
	);

	public static final Project CANTO_CURSES = new Project(
		"canto_curses",
		"https://github.com/themoken/canto-curses/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/themoken/canto-curses/issues",
		".*?(github\\.com\\/themoken\\/canto-curses\\/issues\\/)([0-9]+)",
		2,
		"Python;C"
	);

	public static final Project LIBEVT = new Project(
		"libevt",
		"https://github.com/libyal/libevt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libyal/libevt/issues",
		".*?(github\\.com\\/libyal\\/libevt\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;Makefile;C++;PowerShell;Python;Roff"
	);

	public static final Project QUASSEL = new Project(
		"quassel",
		"https://github.com/quassel/quassel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/quassel/quassel/issues",
		".*?(github\\.com\\/quassel\\/quassel\\/issues\\/)([0-9]+)",
		2,
		"C++;Perl;CMake;Python;Shell;Objective-C++;PLpgSQL;C;PLSQL"
	);

	public static final Project GNOME_SHELL = new Project(
		"gnome-shell",
		"https://github.com/GNOME/gnome-shell/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/gnome-shell/issues",
		".*?(github\\.com\\/GNOME\\/gnome-shell\\/issues\\/)([0-9]+)",
		2,
		"JavaScript;C;CSS;Python;Meson;Shell;C++;GLSL;Perl"
	);

	public static final Project LINUX = new Project(
		"linux",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project LINUX_1 = new Project(
		"linux",
		"https://github.com/libarchive/libarchive/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libarchive/libarchive/issues",
		".*?(github\\.com\\/libarchive\\/libarchive\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;CMake;M4;Objective-C;Makefile;Shell;Batchfile;C++"
	);

	public static final Project TWIG = new Project(
		"twig",
		"https://github.com/fabpot/Twig/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/fabpot/Twig/issues",
		".*?(github\\.com\\/fabpot\\/Twig\\/issues\\/)([0-9]+)",
		2,
		"PHP;C;HTML;M4;JavaScript"
	);

	public static final Project PNGQUANT = new Project(
		"pngquant",
		"https://github.com/pornel/pngquant/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/pornel/pngquant/issues",
		".*?(github\\.com\\/pornel\\/pngquant\\/issues\\/)([0-9]+)",
		2,
		"C;Rust;Roff;Shell;Makefile"
	);

	public static final Project RPM = new Project(
		"rpm",
		"https://github.com/rpm-software-management/rpm/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/rpm-software-management/rpm/issues",
		".*?(github\\.com\\/rpm-software-management\\/rpm\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Perl;M4;Makefile;C++;Python;Objective-C;Dockerfile"
	);

	public static final Project NEDMALLOC = new Project(
		"nedmalloc",
		"https://github.com/ned14/nedmalloc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ned14/nedmalloc/issues",
		".*?(github\\.com\\/ned14\\/nedmalloc\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;CSS;Shell"
	);

	public static final Project DRACUT = new Project(
		"dracut",
		"https://github.com/dracutdevs/dracut/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dracutdevs/dracut/issues",
		".*?(github\\.com\\/dracutdevs\\/dracut\\/issues\\/)([0-9]+)",
		2,
		"Shell;C;CSS;Makefile;Python;Perl;EmacsLisp"
	);

	public static final Project NUMPY = new Project(
		"numpy",
		"https://github.com/numpy/numpy/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/numpy/numpy/issues",
		".*?(github\\.com\\/numpy\\/numpy\\/issues\\/)([0-9]+)",
		2,
		"C;Python;C++;JavaScript;Fortran;Shell;Objective-C;sed;Makefile"
	);

	public static final Project SOGO = new Project(
		"sogo",
		"https://github.com/inverse-inc/sogo/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/inverse-inc/sogo/issues",
		".*?(github\\.com\\/inverse-inc\\/sogo\\/issues\\/)([0-9]+)",
		2,
		"Objective-C;JavaScript;Python;CSS;Shell;RichTextFormat;HTML;Java;Makefile;C;Perl;C++;PHP;PLSQL"
	);

	public static final Project MUJS = new Project(
		"mujs",
		"https://github.com/ccxvii/mujs/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ccxvii/mujs/issues",
		".*?(github\\.com\\/ccxvii\\/mujs\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile"
	);

	public static final Project MBED_TLS = new Project(
		"mbed_tls",
		"https://github.com/ARMmbed/mbedtls/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ARMmbed/mbedtls/issues",
		".*?(github\\.com\\/ARMmbed\\/mbedtls\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Python;C++;Makefile;Perl;CMake;GDB;Tcl;Groovy"
	);

	public static final Project BUCK = new Project(
		"buck",
		"https://github.com/facebook/buck/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/facebook/buck/issues",
		".*?(github\\.com\\/facebook\\/buck\\/issues\\/)([0-9]+)",
		2,
		"Java;Python;JavaScript;C;Kotlin;CSS;Thrift;Shell;Lex;HTML;PowerShell;Dockerfile;Batchfile;Makefile;Smalltalk"
	);

	public static final Project KERBEROS = new Project(
		"kerberos",
		"https://github.com/krb5/krb5/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/krb5/krb5/issues",
		".*?(github\\.com\\/krb5\\/krb5\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Roff;Makefile;HTML;Shell;M4;Perl;TeX;Assembly;Yacc;Awk;EmacsLisp;RPC;Perl6;CSS;Batchfile;Lex;sed"
	);

	public static final Project GRAPHITE2 = new Project(
		"graphite2",
		"https://github.com/silnrsi/graphite/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/silnrsi/graphite/issues",
		".*?(github\\.com\\/silnrsi\\/graphite\\/issues\\/)([0-9]+)",
		2,
		"C++;C#;Python;C;CMake;Perl;Makefile;XS;Shell"
	);

	public static final Project PACEMAKER = new Project(
		"pacemaker",
		"https://github.com/ClusterLabs/pacemaker/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ClusterLabs/pacemaker/issues",
		".*?(github\\.com\\/ClusterLabs\\/pacemaker\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Shell;XSLT;M4;Makefile;Roff;C++"
	);

	public static final Project RUBY = new Project(
		"ruby",
		"https://github.com/flori/json/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/flori/json/issues",
		".*?(github\\.com\\/flori\\/json\\/issues\\/)([0-9]+)",
		2,
		"Java;Ruby;C;Ragel;Shell"
	);

	public static final Project RUBY_1 = new Project(
		"ruby",
		"https://github.com/ruby/ruby/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ruby/ruby/issues",
		".*?(github\\.com\\/ruby\\/ruby\\/issues\\/)([0-9]+)",
		2,
		"Ruby;C;Objective-C;Yacc;Makefile;M4;C++;GDB;Ragel;HTML;JavaScript;CSS;XSLT;Python;Batchfile;Shell;Assembly;EmacsLisp;sed;Scilab;Scheme;Perl;Perl6"
	);

	public static final Project IMAP = new Project(
		"imap",
		"https://github.com/cyrusimap/cyrus-imapd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/cyrusimap/cyrus-imapd/issues",
		".*?(github\\.com\\/cyrusimap\\/cyrus-imapd\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;M4;Roff;Yacc;C++;Shell;TeX;Makefile;Smalltalk;HTML;XS;Python;Lex;Assembly;OpenEdgeABL;Awk;JavaScript;Batchfile;CSS"
	);

	public static final Project INSPIRCD = new Project(
		"inspircd",
		"https://github.com/inspircd/inspircd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/inspircd/inspircd/issues",
		".*?(github\\.com\\/inspircd\\/inspircd\\/issues\\/)([0-9]+)",
		2,
		"C++;Perl;Makefile;C;CMake;Roff;Shell;Batchfile"
	);

	public static final Project WOLFSSL = new Project(
		"wolfssl",
		"https://github.com/wolfSSL/wolfssl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/wolfSSL/wolfssl/issues",
		".*?(github\\.com\\/wolfSSL\\/wolfssl\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;M4;Shell;Python;C#;Makefile;C++;Tcl;Perl;CMake;Objective-C;Ruby;XS"
	);

	public static final Project ZLIB = new Project(
		"zlib",
		"https://github.com/madler/zlib/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/madler/zlib/issues",
		".*?(github\\.com\\/madler\\/zlib\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;Ada;Pascal;C++;C#;Makefile;DIGITALCommandLanguage;Shell;CMake;Groff;Perl;SAS;ModuleManagementSystem;M4;Batchfile"
	);

	public static final Project MOD_AUTH_OPENIDC = new Project(
		"mod_auth_openidc",
		"https://github.com/pingidentity/mod_auth_openidc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/pingidentity/mod_auth_openidc/issues",
		".*?(github\\.com\\/pingidentity\\/mod_auth_openidc\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Makefile;Dockerfile;Shell"
	);

	public static final Project MAPSERVER = new Project(
		"mapserver",
		"https://github.com/mapserver/mapserver/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mapserver/mapserver/issues",
		".*?(github\\.com\\/mapserver\\/mapserver\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Scheme;Python;CMake;HTML;XSLT;C#;Lex;Java;Perl;PHP;Shell;Yacc;Makefile;JavaScript;Objective-C;Batchfile;Dockerfile;Tcl;Ruby"
	);

	public static final Project TROJITA = new Project(
		"trojita",
		"https://github.com/jktjkt/trojita/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jktjkt/trojita/issues",
		".*?(github\\.com\\/jktjkt\\/trojita\\/issues\\/)([0-9]+)",
		2,
		"C++;CMake;HTML;Ragel;NSIS;Shell;Python;C;CSS"
	);

	public static final Project MONO = new Project(
		"mono",
		"https://github.com/mono/mono/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mono/mono/issues",
		".*?(github\\.com\\/mono\\/mono\\/issues\\/)([0-9]+)",
		2,
		"C#;C;TSQL;PLpgSQL;ASP;JavaScript;Makefile;C++;SQLPL;HTML;Objective-C;Shell;M4;Python;PowerShell;Batchfile;PLSQL;Perl;XSLT;Groovy;Smalltalk;Roff;Assembly;CMake;Ruby;CSS;Logos;Java;DTrace;RichTextFormat;VisualBasic;sed;Lua;PHP"
	);

	public static final Project FRROUTING = new Project(
		"frrouting",
		"https://github.com/FRRouting/frr/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/FRRouting/frr/issues",
		".*?(github\\.com\\/FRRouting\\/frr\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Perl;M4;Shell;C++;Makefile;Roff;Yacc;Lex;Dockerfile;CommonLisp;EmacsLisp"
	);

	public static final Project GOAHEAD_WEB_SERVER = new Project(
		"goahead_web_server",
		"https://github.com/embedthis/goahead/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/embedthis/goahead/issues",
		".*?(github\\.com\\/embedthis\\/goahead\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;HTML;Roff;Shell;JavaScript;Scilab;Batchfile;InnoSetup;Python;TypeScript;Perl;ASP"
	);

	public static final Project ENTERPRISE_LINUX_DESKTOP = new Project(
		"enterprise_linux_desktop",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project ENTERPRISE_LINUX_DESKTOP_1 = new Project(
		"enterprise_linux_desktop",
		"https://github.com/mdadams/jasper/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mdadams/jasper/issues",
		".*?(github\\.com\\/mdadams\\/jasper\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;CMake;C++;Roff;Batchfile"
	);

	public static final Project ENTERPRISE_LINUX_DESKTOP_2 = new Project(
		"enterprise_linux_desktop",
		"https://github.com/jpirko/libndp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jpirko/libndp/issues",
		".*?(github\\.com\\/jpirko\\/libndp\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Makefile;Shell"
	);

	public static final Project ENTERPRISE_LINUX_DESKTOP_3 = new Project(
		"enterprise_linux_desktop",
		"https://github.com/dogtagpki/pki/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dogtagpki/pki/issues",
		".*?(github\\.com\\/dogtagpki\\/pki\\/issues\\/)([0-9]+)",
		2,
		"Shell;Java;Python;C++;HTML;C;JavaScript;Perl;CSS;CMake;Makefile;Roff;PLSQL;eC"
	);

	public static final Project ENTERPRISE_LINUX_DESKTOP_4 = new Project(
		"enterprise_linux_desktop",
		"https://github.com/libarchive/libarchive/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libarchive/libarchive/issues",
		".*?(github\\.com\\/libarchive\\/libarchive\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;CMake;M4;Objective-C;Makefile;Shell;Batchfile;C++"
	);

	public static final Project ENTERPRISE_LINUX_DESKTOP_5 = new Project(
		"enterprise_linux_desktop",
		"https://github.com/candlepin/subscription-manager/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/candlepin/subscription-manager/issues",
		".*?(github\\.com\\/candlepin\\/subscription-manager\\/issues\\/)([0-9]+)",
		2,
		"Python;C;JavaScript;Shell;Makefile;CSS;Roff;CMake;HTML"
	);

	public static final Project TNTNET = new Project(
		"tntnet",
		"https://github.com/maekitalo/tntnet/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/maekitalo/tntnet/issues",
		".*?(github\\.com\\/maekitalo\\/tntnet\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;C;M4;Makefile;CSS;Vimscript;Shell;Perl;HTML"
	);

	public static final Project MOD_AUTH_MELLON = new Project(
		"mod_auth_mellon",
		"https://github.com/UNINETT/mod_auth_mellon/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/UNINETT/mod_auth_mellon/issues",
		".*?(github\\.com\\/UNINETT\\/mod_auth_mellon\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;Makefile;EmacsLisp"
	);

	public static final Project LIBXML2 = new Project(
		"libxml2",
		"https://github.com/GNOME/libxml2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/libxml2/issues",
		".*?(github\\.com\\/GNOME\\/libxml2\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Python;Makefile;M4;Shell;JavaScript;XSLT;C++;Objective-C;Batchfile;DIGITALCommandLanguage;Clean;VCL;Roff;Perl;CMake;PHP;Max"
	);

	public static final Project JITSI = new Project(
		"jitsi",
		"https://github.com/jitsi/jitsi/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jitsi/jitsi/issues",
		".*?(github\\.com\\/jitsi\\/jitsi\\/issues\\/)([0-9]+)",
		2,
		"Java;C++;C;Objective-C;Makefile;VisualBasic;CSS;Shell;Roff;XSLT;HTML;CMake"
	);

	public static final Project LIBINFINITY = new Project(
		"libinfinity",
		"https://github.com/gobby/libinfinity/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/gobby/libinfinity/issues",
		".*?(github\\.com\\/gobby\\/libinfinity\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;Shell;M4;C++;Roff"
	);

	public static final Project GIMP = new Project(
		"gimp",
		"https://github.com/GNOME/gimp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/gimp/issues",
		".*?(github\\.com\\/GNOME\\/gimp\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Makefile;Python;Scheme;M4;HTML;Perl;Objective-C;InnoSetup;Shell;Yacc;XSLT;Lex;Perl6;CSS;Lua;Dockerfile;Vimscript;Batchfile;CMake;EmacsLisp"
	);

	public static final Project GIMP_1 = new Project(
		"gimp",
		"https://github.com/cherokee/webserver/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/cherokee/webserver/issues",
		".*?(github\\.com\\/cherokee\\/webserver\\/issues\\/)([0-9]+)",
		2,
		"C;Python;M4;JavaScript;C++;Makefile;CSS;PHP;Shell;Roff;HTML;sed"
	);

	public static final Project GIMP_2 = new Project(
		"gimp",
		"https://github.com/ntp-project/ntp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ntp-project/ntp/issues",
		".*?(github\\.com\\/ntp-project\\/ntp\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;C++;Perl;Shell;Python;Groff;Makefile;Ruby;Yacc;Awk;Batchfile;Scheme;CSS;Assembly;EmacsLisp"
	);

	public static final Project GIMP_3 = new Project(
		"gimp",
		"https://github.com/krb5/krb5/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/krb5/krb5/issues",
		".*?(github\\.com\\/krb5\\/krb5\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Roff;Makefile;HTML;Shell;M4;Perl;TeX;Assembly;Yacc;Awk;EmacsLisp;RPC;Perl6;CSS;Batchfile;Lex;sed"
	);

	public static final Project GIMP_4 = new Project(
		"gimp",
		"https://github.com/mdadams/jasper/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mdadams/jasper/issues",
		".*?(github\\.com\\/mdadams\\/jasper\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;CMake;C++;Roff;Batchfile"
	);

	public static final Project GIMP_5 = new Project(
		"gimp",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project GIMP_6 = new Project(
		"gimp",
		"https://github.com/ocaml/ocaml/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ocaml/ocaml/issues",
		".*?(github\\.com\\/ocaml\\/ocaml\\/issues\\/)([0-9]+)",
		2,
		"OCaml;C;Shell;StandardML;Makefile;Assembly;M4;TeX;C++;Awk;Batchfile;CSS;Perl;HTML;Forth;C#"
	);

	public static final Project GIMP_7 = new Project(
		"gimp",
		"https://github.com/libass/libass/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libass/libass/issues",
		".*?(github\\.com\\/libass\\/libass\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;C++;M4;Makefile;Shell"
	);

	public static final Project GIMP_8 = new Project(
		"gimp",
		"https://github.com/pulp/pulp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/pulp/pulp/issues",
		".*?(github\\.com\\/pulp\\/pulp\\/issues\\/)([0-9]+)",
		2,
		"Python;Shell;C;Puppet;HTML;JavaScript;Dockerfile;Makefile;Ruby"
	);

	public static final Project GIMP_9 = new Project(
		"gimp",
		"https://github.com/libuv/libuv/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libuv/libuv/issues",
		".*?(github\\.com\\/libuv\\/libuv\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Makefile;M4;CMake;Batchfile;Shell"
	);

	public static final Project GIMP_10 = new Project(
		"gimp",
		"https://github.com/MariaDB/server/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/MariaDB/server/issues",
		".*?(github\\.com\\/MariaDB\\/server\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Perl;HTML;Yacc;Objective-C;PHP;CMake;Roff;Shell;Assembly;PLSQL;Pascal;Python;TSQL;M4;Java;SQLPL;Makefile;PLpgSQL;DIGITALCommandLanguage;Batchfile;DTrace;Ruby;XS;Pawn;Lex;Perl6;JavaScript;Scilab;POV-RaySDL;VisualBasic;SAS;ModuleManagementSystem;Awk;PowerShell;SourcePawn"
	);

	public static final Project ANDROID = new Project(
		"android",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project TPM2_0_TOOLS = new Project(
		"tpm2.0-tools",
		"https://github.com/01org/tpm2.0-tools/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/01org/tpm2.0-tools/issues",
		".*?(github\\.com\\/01org\\/tpm2.0-tools\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile;Python;C++;M4"
	);

	public static final Project NEFARIOUS2 = new Project(
		"nefarious2",
		"https://github.com/evilnet/nefarious2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/evilnet/nefarious2/issues",
		".*?(github\\.com\\/evilnet\\/nefarious2\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;Makefile;Shell;Yacc;Batchfile;C++;Lex;M4;Python"
	);

	public static final Project DCRAW = new Project(
		"dcraw",
		"https://github.com/LibRaw/LibRaw/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/LibRaw/LibRaw/issues",
		".*?(github\\.com\\/LibRaw\\/LibRaw\\/issues\\/)([0-9]+)",
		2,
		"C++;C;HTML;M4;Perl;QMake;Makefile;Shell;Batchfile;GDB"
	);

	public static final Project DCRAW_1 = new Project(
		"dcraw",
		"https://github.com/rawstudio/rawstudio/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/rawstudio/rawstudio/issues",
		".*?(github\\.com\\/rawstudio\\/rawstudio\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Makefile;Shell;M4;CSS"
	);

	public static final Project LIBETPAN = new Project(
		"libetpan",
		"https://github.com/dinhviethoa/libetpan/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dinhviethoa/libetpan/issues",
		".*?(github\\.com\\/dinhviethoa\\/libetpan\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;M4;Shell;C++;Objective-C;Batchfile"
	);

	public static final Project LIBVIRT = new Project(
		"libvirt",
		"https://github.com/libvirt/libvirt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libvirt/libvirt/issues",
		".*?(github\\.com\\/libvirt\\/libvirt\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Perl;Makefile;Shell;C++;Python;OCaml;Augeas;DTrace;Objective-C;StandardML;EmacsLisp;RPC"
	);

	public static final Project SHADOWSOCKS_LIBEV = new Project(
		"shadowsocks-libev",
		"https://github.com/shadowsocks/shadowsocks-libev/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/shadowsocks/shadowsocks-libev/issues",
		".*?(github\\.com\\/shadowsocks\\/shadowsocks-libev\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Shell;CMake;Makefile;Python;Dockerfile;Batchfile"
	);

	public static final Project LXD = new Project(
		"lxd",
		"https://github.com/lxc/lxd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/lxc/lxd/issues",
		".*?(github\\.com\\/lxc\\/lxd\\/issues\\/)([0-9]+)",
		2,
		"Go;Shell;C;Python;Makefile;TSQL;EmacsLisp"
	);

	public static final Project LXC = new Project(
		"lxc",
		"https://github.com/lxc/lxc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/lxc/lxc/issues",
		".*?(github\\.com\\/lxc\\/lxc\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;Makefile;Python"
	);

	public static final Project TINE_2_0 = new Project(
		"tine_2.0",
		"https://github.com/tine20/Tine-2.0-Open-Source-Groupware-and-CRM/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/tine20/Tine-2.0-Open-Source-Groupware-and-CRM/issues",
		".*?(github\\.com\\/tine20\\/Tine-2.0-Open-Source-Groupware-and-CRM\\/issues\\/)([0-9]+)",
		2,
		"HTML;JavaScript;PHP;CSS;Python;Vue;Shell;C;CoffeeScript;Hack;Ruby;Smarty;RichTextFormat"
	);

	public static final Project LIBSNDFILE = new Project(
		"libsndfile",
		"https://github.com/erikd/libsndfile/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/erikd/libsndfile/issues",
		".*?(github\\.com\\/erikd\\/libsndfile\\/issues\\/)([0-9]+)",
		2,
		"C;Smarty;CMake;M4;Python;C++;Shell;Makefile;M;MATLAB"
	);

	public static final Project HIPHOP_VIRTUAL_MACHINE_FOR_PHP = new Project(
		"hiphop_virtual_machine_for_php",
		"https://github.com/facebook/hhvm/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/facebook/hhvm/issues",
		".*?(github\\.com\\/facebook\\/hhvm\\/issues\\/)([0-9]+)",
		2,
		"C++;Hack;OCaml;Rust;C;PHP;JavaScript;CMake;Python;Yacc;Objective-C;Shell;Assembly;StandardML;Roff;LLVM;XSLT;Perl;GDB;Batchfile;CSS;Makefile;HTML;Awk"
	);

	public static final Project CJSON = new Project(
		"cjson",
		"https://github.com/DaveGamble/cJSON/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/DaveGamble/cJSON/issues",
		".*?(github\\.com\\/DaveGamble\\/cJSON\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Ruby;CMake;Makefile;Python;Shell"
	);

	public static final Project LIBDWARF = new Project(
		"libdwarf",
		"https://github.com/tomhughes/libdwarf/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/tomhughes/libdwarf/issues",
		".*?(github\\.com\\/tomhughes\\/libdwarf\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;Shell;Makefile;C++;CMake;M4;Python;Objective-C;Awk"
	);

	public static final Project AUTOMATIC_BUG_REPORTING_TOOL = new Project(
		"automatic_bug_reporting_tool",
		"https://github.com/abrt/abrt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/abrt/abrt/issues",
		".*?(github\\.com\\/abrt\\/abrt\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Python;Makefile;M4;C++;Augeas;Logos;EmacsLisp"
	);

	public static final Project AUTOMATIC_BUG_REPORTING_TOOL_1 = new Project(
		"automatic_bug_reporting_tool",
		"https://github.com/abrt/libreport/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/abrt/libreport/issues",
		".*?(github\\.com\\/abrt\\/libreport\\/issues\\/)([0-9]+)",
		2,
		"C;Python;Makefile;C++;M4;Shell;Augeas;EmacsLisp"
	);

	public static final Project MOBY = new Project(
		"moby",
		"https://github.com/moby/moby/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/moby/moby/issues",
		".*?(github\\.com\\/moby\\/moby\\/issues\\/)([0-9]+)",
		2,
		"Go;Shell;PowerShell;Dockerfile;Makefile;C;Vimscript;Assembly"
	);

	public static final Project DOCKER = new Project(
		"docker",
		"https://github.com/opencontainers/runc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/opencontainers/runc/issues",
		".*?(github\\.com\\/opencontainers\\/runc\\/issues\\/)([0-9]+)",
		2,
		"Go;Shell;C;Makefile;Dockerfile"
	);

	public static final Project UBUNTU = new Project(
		"ubuntu",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project UBUNTU_1 = new Project(
		"ubuntu",
		"https://github.com/ImageMagick/ImageMagick/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ImageMagick/ImageMagick/issues",
		".*?(github\\.com\\/ImageMagick\\/ImageMagick\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Makefile;C++;XS;Shell;M4;Perl;Roff;CSS;Objective-C;Tcl;DIGITALCommandLanguage"
	);

	public static final Project LIBHEIF = new Project(
		"libheif",
		"https://github.com/strukturag/libheif/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/strukturag/libheif/issues",
		".*?(github\\.com\\/strukturag\\/libheif\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Go;Shell;M4;JavaScript;Makefile;CMake;Batchfile"
	);

	public static final Project EVINCE = new Project(
		"evince",
		"https://github.com/GNOME/evince/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/evince/issues",
		".*?(github\\.com\\/GNOME\\/evince\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Makefile;Meson;M4;HTML;CSS;Shell;Roff;Python"
	);

	public static final Project MYSQL = new Project(
		"mysql",
		"https://github.com/MariaDB/server/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/MariaDB/server/issues",
		".*?(github\\.com\\/MariaDB\\/server\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Perl;HTML;Yacc;Objective-C;PHP;CMake;Roff;Shell;Assembly;PLSQL;Pascal;Python;TSQL;M4;Java;SQLPL;Makefile;PLpgSQL;DIGITALCommandLanguage;Batchfile;DTrace;Ruby;XS;Pawn;Lex;Perl6;JavaScript;Scilab;POV-RaySDL;VisualBasic;SAS;ModuleManagementSystem;Awk;PowerShell;SourcePawn"
	);

	public static final Project MYSQL_1 = new Project(
		"mysql",
		"https://github.com/mysql/mysql-server/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mysql/mysql-server/issues",
		".*?(github\\.com\\/mysql\\/mysql-server\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;C;Objective-C;Java;CSS;PHP;CMake;HTML;Perl;SQLPL;Assembly;Yacc;Python;Shell;PLpgSQL;Makefile;Pascal;SourcePawn;Roff;XSLT;DIGITALCommandLanguage;ActionScript;Lex;RPC;M4;Awk;POV-RaySDL;AngelScript;Batchfile;SAS;ModuleManagementSystem;sed;VisualBasic;PLSQL"
	);

	public static final Project PICOCOM = new Project(
		"picocom",
		"https://github.com/npat-efault/picocom/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/npat-efault/picocom/issues",
		".*?(github\\.com\\/npat-efault\\/picocom\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Roff;Makefile;Shell"
	);

	public static final Project LIBSASS = new Project(
		"libsass",
		"https://github.com/sass/libsass/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/sass/libsass/issues",
		".*?(github\\.com\\/sass\\/libsass\\/issues\\/)([0-9]+)",
		2,
		"C++;Shell;C;M4;Makefile;Perl;CSS"
	);

	public static final Project CALIBRE = new Project(
		"calibre",
		"https://github.com/kovidgoyal/calibre/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kovidgoyal/calibre/issues",
		".*?(github\\.com\\/kovidgoyal\\/calibre\\/issues\\/)([0-9]+)",
		2,
		"Python;C;C++;JavaScript;CoffeeScript;HTML;Objective-C++;Shell;XSLT;TSQL;Makefile;CSS;Objective-C;Batchfile;Vimscript"
	);

	public static final Project OPENCV = new Project(
		"opencv",
		"https://github.com/opencv/opencv/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/opencv/opencv/issues",
		".*?(github\\.com\\/opencv\\/opencv\\/issues\\/)([0-9]+)",
		2,
		"C++;C;CMake;Java;Python;Objective-C++;JavaScript;Cuda;Shell;Perl;PowerShell;Objective-C;HTML;TeX;Batchfile;Prolog;Dockerfile"
	);

	public static final Project WINSPARKLE = new Project(
		"winsparkle",
		"https://github.com/vslavik/winsparkle/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/vslavik/winsparkle/issues",
		".*?(github\\.com\\/vslavik\\/winsparkle\\/issues\\/)([0-9]+)",
		2,
		"C++;CMake;C;Pascal;Batchfile"
	);

	public static final Project SHELLINABOX = new Project(
		"shellinabox",
		"https://github.com/shellinabox/shellinabox/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/shellinabox/shellinabox/issues",
		".*?(github\\.com\\/shellinabox\\/shellinabox\\/issues\\/)([0-9]+)",
		2,
		"C;CSS;Makefile;HTML;JavaScript;Shell;Objective-C;M4;Ruby;C++"
	);

	public static final Project LIBREOFFICE = new Project(
		"libreoffice",
		"https://github.com/LibreOffice/core/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/LibreOffice/core/issues",
		".*?(github\\.com\\/LibreOffice\\/core\\/issues\\/)([0-9]+)",
		2,
		"C++;Java;XSLT;Makefile;Python;RichTextFormat;Perl;JavaScript;Perl6;HTML;M4;C;VisualBasic;C#;Shell;Objective-C;Yacc;Swift;CSS;Scilab;Awk;PostScript;Assembly;Pascal;Roff;ASP;Batchfile;AppleScript;PHP;AMPL;Prolog;Objective-C++;sed"
	);

	public static final Project LOGGER = new Project(
		"logger",
		"https://github.com/weechat/weechat/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/weechat/weechat/issues",
		".*?(github\\.com\\/weechat\\/weechat\\/issues\\/)([0-9]+)",
		2,
		"C;C++;CMake;M4;Python;Makefile;Shell"
	);

	public static final Project MONGOOSEIM = new Project(
		"mongooseim",
		"https://github.com/esl/MongooseIM/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/esl/MongooseIM/issues",
		".*?(github\\.com\\/esl\\/MongooseIM\\/issues\\/)([0-9]+)",
		2,
		"Erlang;Shell;Python;JavaScript;C;APIBlueprint;Makefile;Dockerfile;C++;PLpgSQL;SQLPL;HTML;Awk"
	);

	public static final Project FIREJAIL = new Project(
		"firejail",
		"https://github.com/netblue30/firejail/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/netblue30/firejail/issues",
		".*?(github\\.com\\/netblue30\\/firejail\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;PHP;Makefile;Python;Vimscript;M4;Perl;C++"
	);

	public static final Project PROFTPD = new Project(
		"proftpd",
		"https://github.com/proftpd/proftpd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/proftpd/proftpd/issues",
		".*?(github\\.com\\/proftpd\\/proftpd\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;PHP;M4;Perl;Makefile;C++;Roff;Objective-C"
	);

	public static final Project LIBRAW = new Project(
		"libraw",
		"https://github.com/LibRaw/LibRaw/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/LibRaw/LibRaw/issues",
		".*?(github\\.com\\/LibRaw\\/LibRaw\\/issues\\/)([0-9]+)",
		2,
		"C++;C;HTML;M4;Perl;QMake;Makefile;Shell;Batchfile;GDB"
	);

	public static final Project FREERDP = new Project(
		"freerdp",
		"https://github.com/FreeRDP/FreeRDP/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/FreeRDP/FreeRDP/issues",
		".*?(github\\.com\\/FreeRDP\\/FreeRDP\\/issues\\/)([0-9]+)",
		2,
		"C;Objective-C;CMake;Java;C++;HTML;Shell;Python;C#;Perl;CSS;Roff;Makefile;RichTextFormat"
	);

	public static final Project FREERDP_1 = new Project(
		"freerdp",
		"https://github.com/sidhpurwala-huzaifa/FreeRDP/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/sidhpurwala-huzaifa/FreeRDP/issues",
		".*?(github\\.com\\/sidhpurwala-huzaifa\\/FreeRDP\\/issues\\/)([0-9]+)",
		2,
		"C;Objective-C;Java;C++;C#;Perl;Shell;Python"
	);

	public static final Project SHADOW = new Project(
		"shadow",
		"https://github.com/shadow-maint/shadow/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/shadow-maint/shadow/issues",
		".*?(github\\.com\\/shadow-maint\\/shadow\\/issues\\/)([0-9]+)",
		2,
		"Shell;C;M4;Yacc;Makefile;Perl"
	);

	public static final Project MRUBY = new Project(
		"mruby",
		"https://github.com/mruby/mruby/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mruby/mruby/issues",
		".*?(github\\.com\\/mruby\\/mruby\\/issues\\/)([0-9]+)",
		2,
		"C;Ruby;Yacc;C++;Batchfile;Shell;Makefile"
	);

	public static final Project WEBMIN = new Project(
		"webmin",
		"https://github.com/webmin/webmin/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/webmin/webmin/issues",
		".*?(github\\.com\\/webmin\\/webmin\\/issues\\/)([0-9]+)",
		2,
		"Perl;HTML;Perl6;JavaScript;Java;NewLisp;Prolog;Python;Shell;CSS;Roff;Makefile;PHP;SystemVerilog;C;EmacsLisp;MAXScript;Batchfile;Ruby;Erlang"
	);

	public static final Project NETWORK_SATELLITE = new Project(
		"network_satellite",
		"https://github.com/spacewalkproject/spacewalk/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/spacewalkproject/spacewalk/issues",
		".*?(github\\.com\\/spacewalkproject\\/spacewalk\\/issues\\/)([0-9]+)",
		2,
		"Java;Python;PLSQL;SQLPL;Perl;HTML;PLpgSQL;Shell;Makefile;JavaScript;Roff;CSS;XSLT;C;Genshi;Groovy;sed;Dockerfile"
	);

	public static final Project BITLBEE = new Project(
		"bitlbee",
		"https://github.com/bitlbee/bitlbee/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/bitlbee/bitlbee/issues",
		".*?(github\\.com\\/bitlbee\\/bitlbee\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;Python;Perl;Vimscript;GDB"
	);

	public static final Project LFTP = new Project(
		"lftp",
		"https://github.com/lavv17/lftp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/lavv17/lftp/issues",
		".*?(github\\.com\\/lavv17\\/lftp\\/issues\\/)([0-9]+)",
		2,
		"C++;C;M4;Shell;Makefile;Perl"
	);

	public static final Project PNP4NAGIOS = new Project(
		"pnp4nagios",
		"https://github.com/lingej/pnp4nagios/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/lingej/pnp4nagios/issues",
		".*?(github\\.com\\/lingej\\/pnp4nagios\\/issues\\/)([0-9]+)",
		2,
		"PHP;HTML;C;Makefile;Perl;JavaScript;Shell;M4;CSS;Hack"
	);

	public static final Project CRYPTO = new Project(
		"crypto",
		"https://github.com/golang/crypto/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/golang/crypto/issues",
		".*?(github\\.com\\/golang\\/crypto\\/issues\\/)([0-9]+)",
		2,
		"Go;Assembly;C"
	);

	public static final Project CRYPTO_1 = new Project(
		"crypto",
		"https://github.com/erlang/otp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/erlang/otp/issues",
		".*?(github\\.com\\/erlang\\/otp\\/issues\\/)([0-9]+)",
		2,
		"Erlang;C;C++;Makefile;Java;EmacsLisp;HTML;Shell;M4;XSLT;DTrace;Perl;Python;Assembly;Objective-C;NSIS;JavaScript;CSS;sed;Elixir;Roff;Ruby;Batchfile;DIGITALCommandLanguage"
	);

	public static final Project ZNC = new Project(
		"znc",
		"https://github.com/znc/znc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/znc/znc/issues",
		".*?(github\\.com\\/znc\\/znc\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;CMake;M4;CSS;Perl;Python;Makefile;Shell;Tcl;C;Groovy;Dockerfile"
	);

	public static final Project LIBGSF = new Project(
		"libgsf",
		"https://github.com/GNOME/libgsf/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GNOME/libgsf/issues",
		".*?(github\\.com\\/GNOME\\/libgsf\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;M4;Makefile;Shell;Python"
	);

	public static final Project TCMU_RUNNER = new Project(
		"tcmu-runner",
		"https://github.com/open-iscsi/tcmu-runner/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/open-iscsi/tcmu-runner/issues",
		".*?(github\\.com\\/open-iscsi\\/tcmu-runner\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;C++;Shell;Roff;Objective-C"
	);

	public static final Project QEMU = new Project(
		"qemu",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project QEMU_1 = new Project(
		"qemu",
		"https://github.com/bonzini/qemu/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/bonzini/qemu/issues",
		".*?(github\\.com\\/bonzini\\/qemu\\/issues\\/)([0-9]+)",
		2,
		"C;Python;C++;Shell;Haxe;Assembly;Perl;Makefile;Objective-C;NSIS;GLSL;GDB;EmacsLisp"
	);

	public static final Project QEMU_2 = new Project(
		"qemu",
		"https://github.com/qemu/qemu/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/qemu/qemu/issues",
		".*?(github\\.com\\/qemu\\/qemu\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Shell;Assembly;Haxe;Perl;Makefile;Objective-C;NSIS;GLSL;GDB;EmacsLisp"
	);

	public static final Project REDIS = new Project(
		"redis",
		"https://github.com/antirez/redis/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/antirez/redis/issues",
		".*?(github\\.com\\/antirez\\/redis\\/issues\\/)([0-9]+)",
		2,
		"C;Tcl;Objective-C;Ruby;Shell;Makefile;C++;Smarty"
	);

	public static final Project EXIM = new Project(
		"exim",
		"https://github.com/Exim/exim/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Exim/exim/issues",
		".*?(github\\.com\\/Exim\\/exim\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;Shell;Elixir;Makefile;Forth;Objective-C;Roff;Brainfuck;Perl6;M4;Logos;DIGITALCommandLanguage;Yacc;E;Fortran;Modula-3;LiveScript"
	);

	public static final Project LEAP = new Project(
		"leap",
		"https://github.com/tats/w3m/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/tats/w3m/issues",
		".*?(github\\.com\\/tats\\/w3m\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Shell;Perl;M4;C++;Makefile;Perl6;Roff;Ruby;Awk;sed"
	);

	public static final Project LEAP_1 = new Project(
		"leap",
		"https://github.com/stedolan/jq/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/stedolan/jq/issues",
		".*?(github\\.com\\/stedolan\\/jq\\/issues\\/)([0-9]+)",
		2,
		"C;Yacc;M4;Shell;JSONiq;C++;Makefile;Lex;Dockerfile;Python"
	);

	public static final Project LEAP_2 = new Project(
		"leap",
		"https://github.com/uclouvain/openjpeg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/uclouvain/openjpeg/issues",
		".*?(github\\.com\\/uclouvain\\/openjpeg\\/issues\\/)([0-9]+)",
		2,
		"C;C++;CMake;Java;Shell;Tcl;Objective-C;Python;InnoSetup;HTML;Makefile"
	);

	public static final Project LEAP_3 = new Project(
		"leap",
		"https://github.com/fragglet/lhasa/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/fragglet/lhasa/issues",
		".*?(github\\.com\\/fragglet\\/lhasa\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Python;Makefile;Objective-C;M4"
	);

	public static final Project LEAP_4 = new Project(
		"leap",
		"https://github.com/krb5/krb5/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/krb5/krb5/issues",
		".*?(github\\.com\\/krb5\\/krb5\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Roff;Makefile;HTML;Shell;M4;Perl;TeX;Assembly;Yacc;Awk;EmacsLisp;RPC;Perl6;CSS;Batchfile;Lex;sed"
	);

	public static final Project LEAP_5 = new Project(
		"leap",
		"https://github.com/roundcube/roundcubemail/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/roundcube/roundcubemail/issues",
		".*?(github\\.com\\/roundcube\\/roundcubemail\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;CSS;HTML;TSQL;PLSQL;Shell;Perl;C;Python"
	);

	public static final Project LEAP_6 = new Project(
		"leap",
		"https://github.com/libass/libass/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libass/libass/issues",
		".*?(github\\.com\\/libass\\/libass\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;C++;M4;Makefile;Shell"
	);

	public static final Project LEAP_7 = new Project(
		"leap",
		"https://github.com/atheme/atheme/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/atheme/atheme/issues",
		".*?(github\\.com\\/atheme\\/atheme\\/issues\\/)([0-9]+)",
		2,
		"C;PHP;Perl;M4;Shell;Makefile;XS;Perl6;Ruby;sed;Python"
	);

	public static final Project LEAP_8 = new Project(
		"leap",
		"https://github.com/TigerVNC/tigervnc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/TigerVNC/tigervnc/issues",
		".*?(github\\.com\\/TigerVNC\\/tigervnc\\/issues\\/)([0-9]+)",
		2,
		"Java;C++;C;CMake;Roff;Shell;Perl;Makefile;Objective-C++;Objective-C;Python;Dockerfile"
	);

	public static final Project LEAP_9 = new Project(
		"leap",
		"https://github.com/quassel/quassel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/quassel/quassel/issues",
		".*?(github\\.com\\/quassel\\/quassel\\/issues\\/)([0-9]+)",
		2,
		"C++;Perl;CMake;Python;Shell;Objective-C++;PLpgSQL;C;PLSQL"
	);

	public static final Project LEAP_10 = new Project(
		"leap",
		"https://github.com/curl/curl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/curl/curl/issues",
		".*?(github\\.com\\/curl\\/curl\\/issues\\/)([0-9]+)",
		2,
		"C;Python;M4;Perl;DIGITALCommandLanguage;CMake;C++;Makefile;Shell;Batchfile;VisualBasic;Roff;Perl6;HTML;EmacsLisp"
	);

	public static final Project MONGOOSE_EMBEDDED_WEB_SERVER_LIBRARY = new Project(
		"mongoose_embedded_web_server_library",
		"https://github.com/cesanta/mongoose/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/cesanta/mongoose/issues",
		".*?(github\\.com\\/cesanta\\/mongoose\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;Python;HTML;Makefile;C++;Shell;Batchfile;Go;JavaScript"
	);

	public static final Project MONGOOSE_EMBEDDED_WEB_SERVER_LIBRARY_1 = new Project(
		"mongoose_embedded_web_server_library",
		"https://github.com/cesanta/mongoose-os/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/cesanta/mongoose-os/issues",
		".*?(github\\.com\\/cesanta\\/mongoose-os\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;Python;C++;Makefile;JavaScript;Go;HTML;Batchfile;Shell"
	);

	public static final Project MINIUPNPD = new Project(
		"miniupnpd",
		"https://github.com/miniupnp/miniupnp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/miniupnp/miniupnp/issues",
		".*?(github\\.com\\/miniupnp\\/miniupnp\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile;Python;CMake;Roff;Java;VisualBasic;Ruby;Batchfile"
	);

	public static final Project ZNC_MSVC = new Project(
		"znc-msvc",
		"https://github.com/znc/znc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/znc/znc/issues",
		".*?(github\\.com\\/znc\\/znc\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;CMake;M4;CSS;Perl;Python;Makefile;Shell;Tcl;C;Groovy;Dockerfile"
	);

	public static final Project LIBJPEG_TURBO = new Project(
		"libjpeg-turbo",
		"https://github.com/libjpeg-turbo/libjpeg-turbo/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libjpeg-turbo/libjpeg-turbo/issues",
		".*?(github\\.com\\/libjpeg-turbo\\/libjpeg-turbo\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;HTML;PHP;Java;C++;CMake;Shell;Roff;CSS;Objective-C;JavaScript;RichTextFormat;Ruby"
	);

	public static final Project XROOTD = new Project(
		"xrootd",
		"https://github.com/xrootd/xrootd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/xrootd/xrootd/issues",
		".*?(github\\.com\\/xrootd\\/xrootd\\/issues\\/)([0-9]+)",
		2,
		"C++;CMake;Python;Shell;Perl;CSS;C;Makefile;HTML"
	);

	public static final Project LIBEXIF = new Project(
		"libexif",
		"https://github.com/libexif/libexif/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libexif/libexif/issues",
		".*?(github\\.com\\/libexif\\/libexif\\/issues\\/)([0-9]+)",
		2,
		"C;M4;C++;Makefile;Shell"
	);

	public static final Project CHROME = new Project(
		"chrome",
		"https://github.com/googlei18n/sfntly/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/googlei18n/sfntly/issues",
		".*?(github\\.com\\/googlei18n\\/sfntly\\/issues\\/)([0-9]+)",
		2,
		"Java;C++;Python;CMake;C"
	);

	public static final Project TIGERVNC = new Project(
		"tigervnc",
		"https://github.com/TigerVNC/tigervnc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/TigerVNC/tigervnc/issues",
		".*?(github\\.com\\/TigerVNC\\/tigervnc\\/issues\\/)([0-9]+)",
		2,
		"Java;C++;C;CMake;Roff;Shell;Perl;Makefile;Objective-C++;Objective-C;Python;Dockerfile"
	);

	public static final Project MUMBLE = new Project(
		"mumble",
		"https://github.com/mumble-voip/mumble/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mumble-voip/mumble/issues",
		".*?(github\\.com\\/mumble-voip\\/mumble\\/issues\\/)([0-9]+)",
		2,
		"C++;QMake;Python;C;Objective-C++;Slice;Perl;Shell;PHP;PowerShell;HLSL;Objective-C;PostScript;C#;Dockerfile;Ruby;Batchfile"
	);

	public static final Project DOVECOT = new Project(
		"dovecot",
		"https://github.com/dovecot/core/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dovecot/core/issues",
		".*?(github\\.com\\/dovecot\\/core\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;C++;M4;Objective-C;Perl;Shell;RPC"
	);

	public static final Project LIBTIFF = new Project(
		"libtiff",
		"https://github.com/vadz/libtiff/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/vadz/libtiff/issues",
		".*?(github\\.com\\/vadz\\/libtiff\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Makefile;Shell;CMake;M4;C++;DIGITALCommandLanguage;Objective-C;Python"
	);

	public static final Project SLURM = new Project(
		"slurm",
		"https://github.com/SchedMD/slurm/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/SchedMD/slurm/issues",
		".*?(github\\.com\\/SchedMD\\/slurm\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;Roff;Shell;Perl;M4;C++;XS;Python;Vimscript;Lua;Objective-C;Cuda"
	);

	public static final Project IRSSI = new Project(
		"irssi",
		"https://github.com/irssi/irssi/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/irssi/irssi/issues",
		".*?(github\\.com\\/irssi\\/irssi\\/issues\\/)([0-9]+)",
		2,
		"C;XS;Perl;M4;Prolog;Makefile;Shell;C++;Objective-C;HCL"
	);

	public static final Project LIBVNCSERVER = new Project(
		"libvncserver",
		"https://github.com/LibVNC/libvncserver/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/LibVNC/libvncserver/issues",
		".*?(github\\.com\\/LibVNC\\/libvncserver\\/issues\\/)([0-9]+)",
		2,
		"C;JavaScript;C++;Shell;CMake;CSS;HTML;Perl;PHP;Python;Makefile"
	);

	public static final Project JASPER = new Project(
		"jasper",
		"https://github.com/mdadams/jasper/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mdadams/jasper/issues",
		".*?(github\\.com\\/mdadams\\/jasper\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;CMake;C++;Roff;Batchfile"
	);

	public static final Project LIMBSPACK = new Project(
		"limbspack",
		"https://github.com/kyz/libmspack/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kyz/libmspack/issues",
		".*?(github\\.com\\/kyz\\/libmspack\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;HTML;Perl;M4;Roff;Makefile"
	);

	public static final Project MONKEY_HTTP_DAEMON = new Project(
		"monkey_http_daemon",
		"https://github.com/monkey/monkey/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/monkey/monkey/issues",
		".*?(github\\.com\\/monkey\\/monkey\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Python;C++;Roff;JavaScript;M4;Shell;Ruby;Makefile;HTML;CSS;Objective-C;sed"
	);

	public static final Project PURE_FTPD = new Project(
		"pure-ftpd",
		"https://github.com/jedisct1/pure-ftpd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jedisct1/pure-ftpd/issues",
		".*?(github\\.com\\/jedisct1\\/pure-ftpd\\/issues\\/)([0-9]+)",
		2,
		"C;M4;C++;Shell;Makefile;Objective-C;Perl"
	);

	public static final Project BSON = new Project(
		"bson",
		"https://github.com/mongodb/bson-ruby/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mongodb/bson-ruby/issues",
		".*?(github\\.com\\/mongodb\\/bson-ruby\\/issues\\/)([0-9]+)",
		2,
		"Ruby;C;Java;Shell"
	);

	public static final Project GIT = new Project(
		"git",
		"https://github.com/git/git/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/git/git/issues",
		".*?(github\\.com\\/git\\/git\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Perl;Tcl;Python;Makefile;C++;JavaScript;M4;Roff;Go;sed;CSS;Objective-C;PHP;Assembly;EmacsLisp"
	);

	public static final Project CANTATA = new Project(
		"cantata",
		"https://github.com/CDrummond/cantata/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/CDrummond/cantata/issues",
		".*?(github\\.com\\/CDrummond\\/cantata\\/issues\\/)([0-9]+)",
		2,
		"C++;CMake;Perl;Python;Shell;Objective-C++;C"
	);

	public static final Project W3M = new Project(
		"w3m",
		"https://github.com/tats/w3m/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/tats/w3m/issues",
		".*?(github\\.com\\/tats\\/w3m\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;Shell;Perl;M4;C++;Makefile;Perl6;Roff;Ruby;Awk;sed"
	);

	public static final Project BENTO4 = new Project(
		"bento4",
		"https://github.com/axiomatic-systems/Bento4/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/axiomatic-systems/Bento4/issues",
		".*?(github\\.com\\/axiomatic-systems\\/Bento4\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;Python;Java;Makefile;C;HTML;Shell;CMake;Batchfile;CSS"
	);

	public static final Project TINC = new Project(
		"tinc",
		"https://github.com/gsliepen/tinc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/gsliepen/tinc/issues",
		".*?(github\\.com\\/gsliepen\\/tinc\\/issues\\/)([0-9]+)",
		2,
		"C;M4;Makefile;C++"
	);

	public static final Project TCPDUMP = new Project(
		"tcpdump",
		"https://github.com/the-tcpdump-group/tcpdump/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/the-tcpdump-group/tcpdump/issues",
		".*?(github\\.com\\/the-tcpdump-group\\/tcpdump\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;M4;Objective-C;Shell;Makefile;Awk;Perl;GDB"
	);

	public static final Project QBITTORRENT = new Project(
		"qbittorrent",
		"https://github.com/qbittorrent/qBittorrent/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/qbittorrent/qBittorrent/issues",
		".*?(github\\.com\\/qbittorrent\\/qBittorrent\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;HTML;Python;CMake;M4;CSS;Shell;QMake;C;Objective-C++"
	);

	public static final Project SETROUBLESHOOT = new Project(
		"setroubleshoot",
		"https://github.com/fedora-selinux/setroubleshoot/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/fedora-selinux/setroubleshoot/issues",
		".*?(github\\.com\\/fedora-selinux\\/setroubleshoot\\/issues\\/)([0-9]+)",
		2,
		"Python;Shell;C;Makefile;M4;Roff;XSLT;CSS"
	);

	public static final Project LIBMATROSKA = new Project(
		"libmatroska",
		"https://github.com/Matroska-Org/libmatroska/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Matroska-Org/libmatroska/issues",
		".*?(github\\.com\\/Matroska-Org\\/libmatroska\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Objective-C;CMake;Makefile;Shell"
	);

	public static final Project TAGLIB = new Project(
		"taglib",
		"https://github.com/taglib/taglib/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/taglib/taglib/issues",
		".*?(github\\.com\\/taglib\\/taglib\\/issues\\/)([0-9]+)",
		2,
		"C++;CMake;C;Shell"
	);

	public static final Project NSPLUGINWRAPPER = new Project(
		"nspluginwrapper",
		"https://github.com/davidben/nspluginwrapper/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/davidben/nspluginwrapper/issues",
		".*?(github\\.com\\/davidben\\/nspluginwrapper\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;C++"
	);

	public static final Project VESTA_CONTROL_PANEL = new Project(
		"vesta_control_panel",
		"https://github.com/serghey-rodin/vesta/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/serghey-rodin/vesta/issues",
		".*?(github\\.com\\/serghey-rodin\\/vesta\\/issues\\/)([0-9]+)",
		2,
		"PHP;Smarty;Shell;HTML;JavaScript;CSS;C++;C;CoffeeScript;Hack"
	);

	public static final Project SUSE_LINUX_ENTERPRISE_REAL_TIME_EXTENSION = new Project(
		"suse_linux_enterprise_real_time_extension",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project GSTREAMER = new Project(
		"gstreamer",
		"https://github.com/GStreamer/gst-plugins-ugly/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/GStreamer/gst-plugins-ugly/issues",
		".*?(github\\.com\\/GStreamer\\/gst-plugins-ugly\\/issues\\/)([0-9]+)",
		2,
		"C;M4;C++;Meson;Makefile;Shell"
	);

	public static final Project LYNX = new Project(
		"lynx",
		"https://github.com/ThomasDickey/lynx-snapshots/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ThomasDickey/lynx-snapshots/issues",
		".*?(github\\.com\\/ThomasDickey\\/lynx-snapshots\\/issues\\/)([0-9]+)",
		2,
		"C;HTML;C++;Objective-C;Batchfile;Roff;Perl;DIGITALCommandLanguage;Yacc;InnoSetup;Shell;ModuleManagementSystem;NSIS;Makefile"
	);

	public static final Project PULP = new Project(
		"pulp",
		"https://github.com/pulp/pulp/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/pulp/pulp/issues",
		".*?(github\\.com\\/pulp\\/pulp\\/issues\\/)([0-9]+)",
		2,
		"Python;Shell;C;Puppet;HTML;JavaScript;Dockerfile;Makefile;Ruby"
	);

	public static final Project TORQUE_RESOURCE_MANAGER = new Project(
		"torque_resource_manager",
		"https://github.com/adaptivecomputing/torque/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/adaptivecomputing/torque/issues",
		".*?(github\\.com\\/adaptivecomputing\\/torque\\/issues\\/)([0-9]+)",
		2,
		"C;C++;M4;Makefile;Perl;Shell;Tcl;Yacc;Python;Lex"
	);

	public static final Project PASSENGER = new Project(
		"passenger",
		"https://github.com/phusion/passenger/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/phusion/passenger/issues",
		".*?(github\\.com\\/phusion\\/passenger\\/issues\\/)([0-9]+)",
		2,
		"C++;Ruby;C;Shell;Makefile;JavaScript;Python;HTML;M4;Objective-C;Groovy;CSS;Perl;Batchfile"
	);

	public static final Project OPENBSD = new Project(
		"openbsd",
		"https://github.com/openbsd/src/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/openbsd/src/issues",
		".*?(github\\.com\\/openbsd\\/src\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Perl;HTML;Roff;Objective-C;GCCMachineDescription;Makefile;Python;Shell;Assembly;Yacc;Perl6;Scheme;TeX;M4;XS;CMake;Logos;Scala;Fortran;Lex;OCaml;DIGITALCommandLanguage;Go;Prolog;Awk;PLSQL;CSS;RPC;sed;EmacsLisp;Scilab;JavaScript;Batchfile;GAP;1CEnterprise;C#;Vimscript;Forth;Objective-C++;Pascal;MATLAB;Gnuplot;Mathematica;Ruby;Dockerfile;Smarty;Turing;SuperCollider;Pawn;KRL;XSLT;eC;SAS;Ada;PHP;R;Java;EmberScript;ModuleManagementSystem;AppleScript;GDB;Rebol;DTrace;StandardML;Lua;Terra"
	);

	public static final Project QPDF = new Project(
		"qpdf",
		"https://github.com/qpdf/qpdf/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/qpdf/qpdf/issues",
		".*?(github\\.com\\/qpdf\\/qpdf\\/issues\\/)([0-9]+)",
		2,
		"C++;Shell;Perl;C;Makefile;M4;PostScript;Batchfile;XSLT;Dockerfile"
	);

	public static final Project PGBOUNCER = new Project(
		"pgbouncer",
		"https://github.com/pgbouncer/pgbouncer/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/pgbouncer/pgbouncer/issues",
		".*?(github\\.com\\/pgbouncer\\/pgbouncer\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;C++;Makefile;M4;Python"
	);

	public static final Project SHIM = new Project(
		"shim",
		"https://github.com/desrt/systemd-shim/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/desrt/systemd-shim/issues",
		".*?(github\\.com\\/desrt\\/systemd-shim\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;M4"
	);

	public static final Project BATTLE_FOR_WESNOTH = new Project(
		"battle_for_wesnoth",
		"https://github.com/wesnoth/wesnoth/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/wesnoth/wesnoth/issues",
		".*?(github\\.com\\/wesnoth\\/wesnoth\\/issues\\/)([0-9]+)",
		2,
		"C++;Java;Python;Lua;EmacsLisp;CMake;C;Mask;Shell;GAP;Perl;TeX;Vimscript;HTML;Objective-C++;NSIS;PHP;Makefile;CSS;sed;JavaScript;GLSL;Batchfile;Objective-C"
	);

	public static final Project IBUS = new Project(
		"ibus",
		"https://github.com/ibus/ibus-anthy/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ibus/ibus-anthy/issues",
		".*?(github\\.com\\/ibus\\/ibus-anthy\\/issues\\/)([0-9]+)",
		2,
		"Python;Perl6;Makefile;M4;Shell;C"
	);

	public static final Project NAGIOS = new Project(
		"nagios",
		"https://github.com/NagiosEnterprises/nagioscore/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/NagiosEnterprises/nagioscore/issues",
		".*?(github\\.com\\/NagiosEnterprises\\/nagioscore\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;Shell;JavaScript;Perl;HTML;CSS;PHP;M4;Roff;Objective-C;Ruby;C++"
	);

	public static final Project WILDMIDI = new Project(
		"wildmidi",
		"https://github.com/Mindwerks/wildmidi/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Mindwerks/wildmidi/issues",
		".*?(github\\.com\\/Mindwerks\\/wildmidi\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Makefile;Shell;C++"
	);

	public static final Project FILE = new Project(
		"file",
		"https://github.com/glensc/file/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/glensc/file/issues",
		".*?(github\\.com\\/glensc\\/file\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;M4;Python;C++;Shell;Dockerfile"
	);

	public static final Project FILE_1 = new Project(
		"file",
		"https://github.com/php/php-src/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/php/php-src/issues",
		".*?(github\\.com\\/php\\/php-src\\/issues\\/)([0-9]+)",
		2,
		"C;PHP;C++;M4;Shell;Objective-C;Lua;JavaScript;Lex;Yacc;Makefile;GAP;GDB;Perl;Batchfile;XSLT;DTrace;Awk;HTML"
	);

	public static final Project FILE_2 = new Project(
		"file",
		"https://github.com/file/file/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/file/file/issues",
		".*?(github\\.com\\/file\\/file\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;M4;Python;C++;Shell;Dockerfile"
	);

	public static final Project CURL = new Project(
		"curl",
		"https://github.com/bagder/curl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/bagder/curl/issues",
		".*?(github\\.com\\/bagder\\/curl\\/issues\\/)([0-9]+)",
		2,
		"C;Python;M4;Perl;DIGITALCommandLanguage;CMake;C++;Makefile;Shell;Batchfile;VisualBasic;Roff;Perl6;HTML;EmacsLisp"
	);

	public static final Project CURL_1 = new Project(
		"curl",
		"https://github.com/curl/curl/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/curl/curl/issues",
		".*?(github\\.com\\/curl\\/curl\\/issues\\/)([0-9]+)",
		2,
		"C;Python;M4;Perl;DIGITALCommandLanguage;CMake;C++;Makefile;Shell;Batchfile;VisualBasic;Roff;Perl6;HTML;EmacsLisp"
	);

	public static final Project RAWSTUDIO = new Project(
		"rawstudio",
		"https://github.com/rawstudio/rawstudio/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/rawstudio/rawstudio/issues",
		".*?(github\\.com\\/rawstudio\\/rawstudio\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Makefile;Shell;M4;CSS"
	);

	public static final Project NINKA = new Project(
		"ninka",
		"https://github.com/dmgerman/ninka/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dmgerman/ninka/issues",
		".*?(github\\.com\\/dmgerman\\/ninka\\/issues\\/)([0-9]+)",
		2,
		"Roff;Perl;C++;Makefile;C"
	);

	public static final Project AIRCRACK_NG = new Project(
		"aircrack-ng",
		"https://github.com/aircrack-ng/aircrack-ng/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/aircrack-ng/aircrack-ng/issues",
		".*?(github\\.com\\/aircrack-ng\\/aircrack-ng\\/issues\\/)([0-9]+)",
		2,
		"C;M4;C#;Shell;Python;Makefile;C++;Assembly;Objective-C;PowerShell;Roff;Tcl;CMake"
	);

	public static final Project OPA_FF = new Project(
		"opa-ff",
		"https://github.com/01org/opa-ff/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/01org/opa-ff/issues",
		".*?(github\\.com\\/01org\\/opa-ff\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Perl;Makefile;C++;Python;Tcl;Gnuplot;Objective-C"
	);

	public static final Project OPA_FF_1 = new Project(
		"opa-ff",
		"https://github.com/01org/opa-fm/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/01org/opa-fm/issues",
		".*?(github\\.com\\/01org\\/opa-fm\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;C++;Shell;Makefile;Objective-C;Python;Gnuplot"
	);

	public static final Project LIBMSPACK = new Project(
		"libmspack",
		"https://github.com/vrtadmin/clamav-devel/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/vrtadmin/clamav-devel/issues",
		".*?(github\\.com\\/vrtadmin\\/clamav-devel\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Makefile;Shell;M4;Python;Perl;CMake;Objective-C;Yacc;HTML;RichTextFormat;Lex;InnoSetup;Vimscript;EmacsLisp;Gnuplot;Pawn;JavaScript;Assembly;LLVM;GDB;Batchfile"
	);

	public static final Project LIBMSPACK_1 = new Project(
		"libmspack",
		"https://github.com/kyz/libmspack/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kyz/libmspack/issues",
		".*?(github\\.com\\/kyz\\/libmspack\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;HTML;Perl;M4;Roff;Makefile"
	);

	public static final Project GRAPHVIZ = new Project(
		"graphviz",
		"https://github.com/ellson/graphviz/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ellson/graphviz/issues",
		".*?(github\\.com\\/ellson\\/graphviz\\/issues\\/)([0-9]+)",
		2,
		"C;C++;HTML;Pascal;Roff;Makefile;M4;Tcl;Yacc;Shell;Objective-C;CMake;C#;VisualBasic;PostScript;Java;Perl;Lex;Batchfile;Awk;Python;PHP;Ruby;Lua;MAXScript;Go;sed"
	);

	public static final Project ONIGURUMA = new Project(
		"oniguruma",
		"https://github.com/kkos/oniguruma/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kkos/oniguruma/issues",
		".*?(github\\.com\\/kkos\\/oniguruma\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Python;HTML;CMake;Makefile;M4;C++;Batchfile"
	);

	public static final Project AUTHORITATIVE = new Project(
		"authoritative",
		"https://github.com/PowerDNS/pdns/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/PowerDNS/pdns/issues",
		".*?(github\\.com\\/PowerDNS\\/pdns\\/issues\\/)([0-9]+)",
		2,
		"C++;Python;JavaScript;DIGITALCommandLanguage;Shell;M4;Makefile;Ruby;TSQL;Lua;C;Perl;CSS;PLSQL;HTML;Ragel;Yacc;Lex;Isabelle;Dockerfile"
	);

	public static final Project WEBMAIL = new Project(
		"webmail",
		"https://github.com/roundcube/roundcubemail/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/roundcube/roundcubemail/issues",
		".*?(github\\.com\\/roundcube\\/roundcubemail\\/issues\\/)([0-9]+)",
		2,
		"PHP;JavaScript;CSS;HTML;TSQL;PLSQL;Shell;Perl;C;Python"
	);

	public static final Project KAMAILIO = new Project(
		"kamailio",
		"https://github.com/kamailio/kamailio/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kamailio/kamailio/issues",
		".*?(github\\.com\\/kamailio\\/kamailio\\/issues\\/)([0-9]+)",
		2,
		"C;C++;TSQL;Shell;Makefile;Yacc;Python;Perl;Lex;XS;Java;M4;Roff;PLSQL;PHP;PLpgSQL;Vimscript;Lua;JavaScript;Perl6;Objective-C;Dockerfile;Ragel;Awk;HTML;C#;GDB"
	);

	public static final Project TNEF = new Project(
		"tnef",
		"https://github.com/verdammelt/tnef/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/verdammelt/tnef/issues",
		".*?(github\\.com\\/verdammelt\\/tnef\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;Makefile;Awk;Perl;M4"
	);

	public static final Project SALT_2015 = new Project(
		"salt_2015",
		"https://github.com/twangboy/salt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/twangboy/salt/issues",
		".*?(github\\.com\\/twangboy\\/salt\\/issues\\/)([0-9]+)",
		2,
		"Python;Shell;PowerShell;Batchfile;SaltStack;NSIS;HTML;Tcl;Scheme;Makefile;C;Roff"
	);

	public static final Project SALT_2015_1 = new Project(
		"salt_2015",
		"https://github.com/saltstack/salt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/saltstack/salt/issues",
		".*?(github\\.com\\/saltstack\\/salt\\/issues\\/)([0-9]+)",
		2,
		"Python;Shell;Groovy;SaltStack;NSIS;Batchfile;PowerShell;HTML;TSQL;Scheme;RichTextFormat;Ruby;Makefile;C;Roff;Dockerfile;HCL"
	);

	public static final Project CAPSTONE = new Project(
		"capstone",
		"https://github.com/aquynh/capstone/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/aquynh/capstone/issues",
		".*?(github\\.com\\/aquynh\\/capstone\\/issues\\/)([0-9]+)",
		2,
		"C;Java;C#;Python;OCaml;Smalltalk;C++;VisualBasic;Makefile;PowerShell;CMake;Batchfile;Shell;Tcl"
	);

	public static final Project OP_TEE_OS = new Project(
		"op-tee_os",
		"https://github.com/libtom/libtomcrypt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libtom/libtomcrypt/issues",
		".*?(github\\.com\\/libtom\\/libtomcrypt\\/issues\\/)([0-9]+)",
		2,
		"C;Makefile;Perl;Shell;Java;Python"
	);

	public static final Project OP_TEE_OS_1 = new Project(
		"op-tee_os",
		"https://github.com/jenkinsci/jenkins/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/jenkinsci/jenkins/issues",
		".*?(github\\.com\\/jenkinsci\\/jenkins\\/issues\\/)([0-9]+)",
		2,
		"Java;HTML;JavaScript;CSS;Groovy;Ruby;Perl;Shell;GAP;C;Dockerfile;Batchfile"
	);

	public static final Project MONGODB = new Project(
		"mongodb",
		"https://github.com/mongodb/mongo/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mongodb/mongo/issues",
		".*?(github\\.com\\/mongodb\\/mongo\\/issues\\/)([0-9]+)",
		2,
		"C++;JavaScript;Python;Go;Shell;C;Java;RichTextFormat;Perl;Ruby;HTML;GDB;Batchfile"
	);

	public static final Project MONGODB_1 = new Project(
		"mongodb",
		"https://github.com/mongodb/mongo-python-driver/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mongodb/mongo-python-driver/issues",
		".*?(github\\.com\\/mongodb\\/mongo-python-driver\\/issues\\/)([0-9]+)",
		2,
		"Python;C;Shell"
	);

	public static final Project DEBIAN_LINUX = new Project(
		"debian_linux",
		"https://github.com/mapserver/mapserver/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mapserver/mapserver/issues",
		".*?(github\\.com\\/mapserver\\/mapserver\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Scheme;Python;CMake;HTML;XSLT;C#;Lex;Java;Perl;PHP;Shell;Yacc;Makefile;JavaScript;Objective-C;Batchfile;Dockerfile;Tcl;Ruby"
	);

	public static final Project DEBIAN_LINUX_1 = new Project(
		"debian_linux",
		"https://github.com/ellson/graphviz/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ellson/graphviz/issues",
		".*?(github\\.com\\/ellson\\/graphviz\\/issues\\/)([0-9]+)",
		2,
		"C;C++;HTML;Pascal;Roff;Makefile;M4;Tcl;Yacc;Shell;Objective-C;CMake;C#;VisualBasic;PostScript;Java;Perl;Lex;Batchfile;Awk;Python;PHP;Ruby;Lua;MAXScript;Go;sed"
	);

	public static final Project DEBIAN_LINUX_2 = new Project(
		"debian_linux",
		"https://github.com/mjg59/pupnp-code/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/mjg59/pupnp-code/issues",
		".*?(github\\.com\\/mjg59\\/pupnp-code\\/issues\\/)([0-9]+)",
		2,
		"C;M4;TeX;Makefile;HTML;C++;Shell"
	);

	public static final Project DEBIAN_LINUX_3 = new Project(
		"debian_linux",
		"https://github.com/gpac/gpac/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/gpac/gpac/issues",
		".*?(github\\.com\\/gpac\\/gpac\\/issues\\/)([0-9]+)",
		2,
		"C;C++;JavaScript;Java;Shell;Makefile;XSLT;Objective-C;NSIS;Rebol;GLSL;Assembly;Batchfile;HTML;CSS"
	);

	public static final Project DEBIAN_LINUX_4 = new Project(
		"debian_linux",
		"https://github.com/inspircd/inspircd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/inspircd/inspircd/issues",
		".*?(github\\.com\\/inspircd\\/inspircd\\/issues\\/)([0-9]+)",
		2,
		"C++;Perl;Makefile;C;CMake;Roff;Shell;Batchfile"
	);

	public static final Project DEBIAN_LINUX_5 = new Project(
		"debian_linux",
		"https://github.com/inverse-inc/sogo/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/inverse-inc/sogo/issues",
		".*?(github\\.com\\/inverse-inc\\/sogo\\/issues\\/)([0-9]+)",
		2,
		"Objective-C;JavaScript;Python;CSS;Shell;RichTextFormat;HTML;Java;Makefile;C;Perl;C++;PHP;PLSQL"
	);

	public static final Project DEBIAN_LINUX_6 = new Project(
		"debian_linux",
		"https://github.com/libevent/libevent/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libevent/libevent/issues",
		".*?(github\\.com\\/libevent\\/libevent\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Python;C++;Roff;M4;Shell;Makefile;sed"
	);

	public static final Project DEBIAN_LINUX_7 = new Project(
		"debian_linux",
		"https://github.com/krb5/krb5/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/krb5/krb5/issues",
		".*?(github\\.com\\/krb5\\/krb5\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Python;Roff;Makefile;HTML;Shell;M4;Perl;TeX;Assembly;Yacc;Awk;EmacsLisp;RPC;Perl6;CSS;Batchfile;Lex;sed"
	);

	public static final Project DEBIAN_LINUX_8 = new Project(
		"debian_linux",
		"https://github.com/collectd/collectd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/collectd/collectd/issues",
		".*?(github\\.com\\/collectd\\/collectd\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;M4;PHP;Java;Makefile;C++;JavaScript;Python;Shell;PLpgSQL;Yacc;Lex;Ruby;CSS;Dockerfile"
	);

	public static final Project DEBIAN_LINUX_9 = new Project(
		"debian_linux",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project DEBIAN_LINUX_10 = new Project(
		"debian_linux",
		"https://github.com/viewvc/viewvc/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/viewvc/viewvc/issues",
		".*?(github\\.com\\/viewvc\\/viewvc\\/issues\\/)([0-9]+)",
		2,
		"Python;HTML;C++;C;CSS;Yacc;Shell;Makefile;JavaScript"
	);

	public static final Project DEBIAN_LINUX_11 = new Project(
		"debian_linux",
		"https://github.com/heimdal/heimdal/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/heimdal/heimdal/issues",
		".*?(github\\.com\\/heimdal\\/heimdal\\/issues\\/)([0-9]+)",
		2,
		"C;Roff;TeX;Shell;Makefile;M4;Perl;Python;Yacc;C++;Lex;Awk;Perl6;Objective-C;Java;Clarion;Assembly;HTML;RichTextFormat"
	);

	public static final Project DEBIAN_LINUX_12 = new Project(
		"debian_linux",
		"https://github.com/uclouvain/openjpeg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/uclouvain/openjpeg/issues",
		".*?(github\\.com\\/uclouvain\\/openjpeg\\/issues\\/)([0-9]+)",
		2,
		"C;C++;CMake;Java;Shell;Tcl;Objective-C;Python;InnoSetup;HTML;Makefile"
	);

	public static final Project DEBIAN_LINUX_13 = new Project(
		"debian_linux",
		"https://github.com/yarolig/didiwiki/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/yarolig/didiwiki/issues",
		".*?(github\\.com\\/yarolig\\/didiwiki\\/issues\\/)([0-9]+)",
		2,
		"C;CSS;Shell"
	);

	public static final Project DEBIAN_LINUX_14 = new Project(
		"debian_linux",
		"https://github.com/kamailio/kamailio/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/kamailio/kamailio/issues",
		".*?(github\\.com\\/kamailio\\/kamailio\\/issues\\/)([0-9]+)",
		2,
		"C;C++;TSQL;Shell;Makefile;Yacc;Python;Perl;Lex;XS;Java;M4;Roff;PLSQL;PHP;PLpgSQL;Vimscript;Lua;JavaScript;Perl6;Objective-C;Dockerfile;Ragel;Awk;HTML;C#;GDB"
	);

	public static final Project DEBIAN_LINUX_15 = new Project(
		"debian_linux",
		"https://github.com/perl5-dbi/DBD-mysql/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/perl5-dbi/DBD-mysql/issues",
		".*?(github\\.com\\/perl5-dbi\\/DBD-mysql\\/issues\\/)([0-9]+)",
		2,
		"Perl;C;Objective-C"
	);

	public static final Project DEBIAN_LINUX_16 = new Project(
		"debian_linux",
		"https://github.com/axkibe/lsyncd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/axkibe/lsyncd/issues",
		".*?(github\\.com\\/axkibe\\/lsyncd\\/issues\\/)([0-9]+)",
		2,
		"Lua;C;CMake;M4;Shell"
	);

	public static final Project DEBIAN_LINUX_17 = new Project(
		"debian_linux",
		"https://github.com/westes/flex/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/westes/flex/issues",
		".*?(github\\.com\\/westes\\/flex\\/issues\\/)([0-9]+)",
		2,
		"C;Lex;Yacc;Makefile;M4;Perl;Shell;C++;LLVM;Roff"
	);

	public static final Project DEBIAN_LINUX_18 = new Project(
		"debian_linux",
		"https://github.com/libgd/libgd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libgd/libgd/issues",
		".*?(github\\.com\\/libgd\\/libgd\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;Objective-C;C++;M4;HTML;Shell;DIGITALCommandLanguage;Makefile;Perl;Batchfile;Tcl;Python"
	);

	public static final Project DEBIAN_LINUX_19 = new Project(
		"debian_linux",
		"https://github.com/FFmpeg/FFmpeg/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/FFmpeg/FFmpeg/issues",
		".*?(github\\.com\\/FFmpeg\\/FFmpeg\\/issues\\/)([0-9]+)",
		2,
		"C;Assembly;Objective-C;Makefile;C++;Shell;Cuda;Perl;Awk;Python;HTML;Ruby;Verilog;Roff"
	);

	public static final Project DEBIAN_LINUX_20 = new Project(
		"debian_linux",
		"https://github.com/neomutt/neomutt/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/neomutt/neomutt/issues",
		".*?(github\\.com\\/neomutt\\/neomutt\\/issues\\/)([0-9]+)",
		2,
		"C;Tcl;Shell;Perl;CSS;HTML;Lua;Roff;Python;Scheme"
	);

	public static final Project DEBIAN_LINUX_21 = new Project(
		"debian_linux",
		"https://github.com/charybdis-ircd/charybdis/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/charybdis-ircd/charybdis/issues",
		".*?(github\\.com\\/charybdis-ircd\\/charybdis\\/issues\\/)([0-9]+)",
		2,
		"C;Shell;M4;Makefile;Lex;Yacc;Roff;C++"
	);

	public static final Project DEBIAN_LINUX_22 = new Project(
		"debian_linux",
		"https://github.com/libgit2/libgit2/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/libgit2/libgit2/issues",
		".*?(github\\.com\\/libgit2\\/libgit2\\/issues\\/)([0-9]+)",
		2,
		"C;CMake;C++;Shell;Python;PHP;PowerShell;HTML;Objective-C"
	);

	public static final Project CYRUS_IMAP = new Project(
		"cyrus_imap",
		"https://github.com/cyrusimap/cyrus-imapd/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/cyrusimap/cyrus-imapd/issues",
		".*?(github\\.com\\/cyrusimap\\/cyrus-imapd\\/issues\\/)([0-9]+)",
		2,
		"C;Perl;M4;Roff;Yacc;C++;Shell;TeX;Makefile;Smalltalk;HTML;XS;Python;Lex;Assembly;OpenEdgeABL;Awk;JavaScript;Batchfile;CSS"
	);

	public static final Project LINUX_ENTERPRISE_REAL_TIME_EXTENSION = new Project(
		"linux_enterprise_real_time_extension",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project SUSE_LINUX_ENTERPRISE_DEBUGINFO = new Project(
		"suse_linux_enterprise_debuginfo",
		"https://github.com/torvalds/linux/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/torvalds/linux/issues",
		".*?(github\\.com\\/torvalds\\/linux\\/issues\\/)([0-9]+)",
		2,
		"C;C++;Assembly;Objective-C;Makefile;Shell;Perl;Python;Roff;Yacc;Lex;Awk;UnrealScript;Gherkin;M4;XS;Clojure;Perl6;sed"
	);

	public static final Project PYCRYPTO = new Project(
		"pycrypto",
		"https://github.com/dlitz/pycrypto/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/dlitz/pycrypto/issues",
		".*?(github\\.com\\/dlitz\\/pycrypto\\/issues\\/)([0-9]+)",
		2,
		"Python;C;Shell;C++"
	);

	public static final Project PYCRYPTO_1 = new Project(
		"pycrypto",
		"https://github.com/Legrandin/pycrypto/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/Legrandin/pycrypto/issues",
		".*?(github\\.com\\/Legrandin\\/pycrypto\\/issues\\/)([0-9]+)",
		2,
		"Python;C;Shell;C++"
	);

	public static final Project BFGMINER = new Project(
		"bfgminer",
		"https://github.com/ckolivas/cgminer/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/ckolivas/cgminer/issues",
		".*?(github\\.com\\/ckolivas\\/cgminer\\/issues\\/)([0-9]+)",
		2,
		"C;M4;PHP;CMake;C++;Makefile;Shell;Python;Java;Ruby"
	);

	public static final Project BFGMINER_1 = new Project(
		"bfgminer",
		"https://github.com/luke-jr/bfgminer/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/luke-jr/bfgminer/issues",
		".*?(github\\.com\\/luke-jr\\/bfgminer\\/issues\\/)([0-9]+)",
		2,
		"C;M4;PHP;C++;Makefile;Assembly;Shell;Python;Ruby"
	);

	public static final Project BFGMINER_2 = new Project(
		"bfgminer",
		"https://github.com/sgminer-dev/sgminer/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/sgminer-dev/sgminer/issues",
		".*?(github\\.com\\/sgminer-dev\\/sgminer\\/issues\\/)([0-9]+)",
		2,
		"C;C++;PHP;Java;Python;Shell;Batchfile;Objective-C"
	);

	public static final Project AUDIOFILE = new Project(
		"audiofile",
		"https://github.com/antlarr/audiofile/",
		".*?(github\\.com).*?(commit)+.*?(/)+([a-f0-9]+)",
		4,
		"",
		0,
		"https://github.com/antlarr/audiofile/issues",
		".*?(github\\.com\\/antlarr\\/audiofile\\/issues\\/)([0-9]+)",
		2,
		"C++;C;Makefile;M4;Shell"
	);

}