/**
 * Copyright (c) [2018] [Yared Abayneh Abebe]
 *
 * This file is part of Coupled_ABM-Flood_Model.
 * Coupled_ABM-Flood_Model is free software licensed under the CC BY-NC-SA 4.0
 * You are free to:
 *	 Share — copy and redistribute the material in any medium or format
 *   Adapt — remix, transform, and build upon the material
 * The licensor cannot revoke these freedoms as long as you follow the license terms.
 *	 Attribution — You must give appropriate credit, provide a link to the license, 
 *				  and indicate if changes were made. You may do so in any reasonable 
 *				  manner, but not in any way that suggests the licensor endorses you 
 *				  or your use.
 *	 NonCommercial — You may not use the material for commercial purposes.
 *	 ShareAlike — If you remix, transform, or build upon the material, you must distribute 
 *				 your contributions under the same license as the original. 
 *   Full license description: https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
 
package physicalStructure;

/*import stMaarten.StMaartenBuilder;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.operation.distance.DistanceOp;*/

/**
 * This class shows the whole island (a polygon feature CoastLine_polygon.shp).
 * It is created just for visualisation purpose.
 */
public class CoastLinePolygon {

	public CoastLinePolygon() {
		super();
	}
	// this method better works to compute the distance between a polygon feature and a point feature located outside the polygon.
	/*public static double distanceCoastLine(Geometry location) {
		DistanceOp distanceOp = new DistanceOp(location, StMaartenBuilder.getCoastLineGeom().get(0));
		double distanceToSea = distanceOp.distance(location, StMaartenBuilder.getCoastLineGeom().get(0));
		return distanceToSea;
	}*/
}
