﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProcesoPractica.entidades
{
    class Region
    {
        private int _id_region;
        private String _nombre_region;

        public Region() { }

        #region "accesadoresa y mutadores"
        public int Id_region
        {
            get { return _id_region; }
            set { _id_region = value; }
        }
        public String Nombre_region
        {
            get { return _nombre_region; }
            set { _nombre_region = value; }
        }
        #endregion
    }
}
