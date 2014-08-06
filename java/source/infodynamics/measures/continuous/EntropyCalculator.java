/*
 *  Java Information Dynamics Toolkit (JIDT)
 *  Copyright (C) 2012, Joseph T. Lizier
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package infodynamics.measures.continuous;

public interface EntropyCalculator {

	/**
	 * Initialise the calculator using the existing or default value of calculator-specific parameters
	 * 
	 */
	public void initialise() throws Exception;
	
	/**
	 * Allows the user to set properties for the underlying calculator implementation
	 * New property values are not guaranteed to take effect until the next call
	 *  to an initialise method. 
	 * 
	 * @param propertyName
	 * @param propertyValue
	 * @throws Exception
	 */
	public void setProperty(String propertyName, String propertyValue) throws Exception;

	public void setObservations(double observations[]);
	
	public double computeAverageLocalOfObservations();

	public void setDebug(boolean debug);
}
