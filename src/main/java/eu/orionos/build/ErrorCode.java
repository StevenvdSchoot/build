/*  Build - Hopefully a simple build system
    Copyright (C) 2013 - Bart Kuivenhoven

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA. 

    A version of the licence can also be found at http://gnu.org/licences/
*/

package eu.orionos.build;

public class ErrorCode {
	public static final int SUCCESS = 0;
	public static final int OPTION_UNSPECIFIED = 1;
	public static final int COMPILE_FAILED = 2;
	public static final int LINK_FAILED = 3;
	public static final int ARCHIVE_FAILED = 4;
	public static final int PARSE_FAILED = 5;
	public static final int FILE_NOT_FOUND = 6;
	public static final int NAME_CONFLICT = 7;
	public static final int INSTRUCTION_FAILED = 8;
	public static final int GENERIC = 9;
}
