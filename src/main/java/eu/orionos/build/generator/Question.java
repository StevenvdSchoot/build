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
package eu.orionos.build.generator;

public class Question {
	private String key;
	private Answer answer;

	public Question(String key, Answer answer)
	{
		if (key == null)
			throw new IllegalArgumentException("Invalid key argument");
		this.key = key;
		this.answer = answer;
	}

	public String getKey()
	{
		return this.key;
	}

	public Answer getAnswer()
	{
		return this.answer;
	}

	public void poseQuestion()
	{
		answer.askForValue(this);
	}
}
