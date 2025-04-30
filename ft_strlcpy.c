/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strlcpy.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 11:34:48 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 13:01:31 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>
#include "libft.h"
#include <stdlib.h>

size_t	ft_strlcpy(char *dst, const char *src, size_t size)
{
	size_t	i;

	if (size == 0)
		return (ft_strlen((char *)src));
	i = 0;
	while (src[i] && i < size -1)
	{
		dst[i] = src[i];
		i++;
	}
	dst[i] = '\0';
	return (ft_strlen((char *)src));
}
/*
int	main(void)
{
	char src[] = "Hola Mundooo";
	char dst1[20];
	char dst2[5];
	char dst3[1];
	size_t result;

	result = ft_strlcpy(dst1, src, sizeof(dst1));
	printf("Caso 1 (dst[20])\n");
	printf("src:  '%s' (len: %zu)\n", src, strlen(src));
	printf("dst1: '%s' (len copiada: %zu)\n", dst1, result);
	printf("(Se espera: copia completa y retorno 12)\n\n");

	result = ft_strlcpy(dst2, src, sizeof(dst2));
	printf("Caso 2 (dst[5])\n");
	printf("src:  '%s' (len: %zu)\n", src, strlen(src));
	printf("dst2: '%s' (len copiada: %zu)\n", dst2, result);
	printf("(Se espera: 'Hola' + '\\0' y retorno 12)\n\n");

	result = ft_strlcpy(dst3, src, sizeof(dst3));
	printf("Caso 3 (dst[1])\n");
	printf("src:  '%s' (len: %zu)\n", src, strlen(src));
	printf("dst3: '%s' (len copiada: %zu)\n", dst3, result);
	printf("(Se espera: string vacío y retorno 12)\n\n");
	
	result = ft_strlcpy(NULL, src, 0);
	printf("Caso 4 (tamaño 0)\n");
	printf("src:  '%s' (len: %zu)\n", src, strlen(src));
	printf("resultado: %zu\n", result);
	printf("(Se espera: retorno 12 sin modificar dst)\n");
	return (0);
}*/
